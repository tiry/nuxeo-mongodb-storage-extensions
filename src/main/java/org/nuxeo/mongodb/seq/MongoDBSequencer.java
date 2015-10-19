package org.nuxeo.mongodb.seq;

import java.net.UnknownHostException;

import org.nuxeo.ecm.core.api.NuxeoException;
import org.nuxeo.ecm.core.uidgen.AbstractUIDSequencer;
import org.nuxeo.ecm.core.uidgen.UIDSequencer;
import org.nuxeo.runtime.api.Framework;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

public class MongoDBSequencer extends AbstractUIDSequencer implements UIDSequencer {

    protected String server;

    protected String dbname;

    protected String collectionName = "counters";

    protected MongoClient client;

    public MongoDBSequencer() {
        super();
    }

    public MongoDBSequencer(String server, String dbname) {
        this();
        this.server = server;
        this.dbname = dbname;
    }

    protected String getServer() {

        if (server == null) {
            server = Framework.getProperty("nuxeo.mongodb.server");
        }
        return server;
    }

    protected String getDBName() {

        if (dbname == null) {
            dbname = Framework.getProperty("nuxeo.mongodb.dbname");
        }
        return dbname;
    }

    @Override
    public void dispose() {
        if (client != null) {
            client.close();
        }
    }

    protected DBCollection getCounterCollection() {
        if (client == null) {
            init();
        }
        return client.getDB(getDBName()).getCollection(collectionName);
    }

    @Override
    public int getNext(String key) {

        DBObject query = new BasicDBObject();
        query.put("_id", key);

        DBObject update = new BasicDBObject();
        DBObject updateValue = new BasicDBObject();
        updateValue.put("seq", 1);
        update.put("$inc", updateValue);

        DBObject res = getCounterCollection().findAndModify(query, null, null, false, update, true,
                true);

        return (int) res.get("seq");
    }

    @Override
    public void init() {
        try {
            if (getServer().startsWith("mongodb://")) {
                client = new MongoClient(new MongoClientURI(getServer()));
            } else {
                client = new MongoClient(new ServerAddress(getServer()));
            }
        } catch (UnknownHostException e) {
            throw new NuxeoException("Unable to init MongoDB client", e);
        }
    }

    @Override
    public void initSequence(String key, int value) {

        DBObject query = new BasicDBObject();
        query.put("_id", key);

        DBObject update = new BasicDBObject();
        update.put("seq", value);

        getCounterCollection().findAndModify(query, null, null, false, update, true,
                true);
    }

}
