package org.nuxeo.mongodb.blob;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.nuxeo.ecm.core.api.Blob;
import org.nuxeo.ecm.core.blob.BlobManager.BlobInfo;
import org.nuxeo.ecm.core.blob.BlobProvider;
import org.nuxeo.ecm.core.blob.ManagedBlob;
import org.nuxeo.ecm.core.blob.SimpleManagedBlob;
import org.nuxeo.ecm.core.model.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.gridfs.GridFS;

public class GridFSBlobProvider implements BlobProvider {

    protected String blobProviderId;
    protected MongoClient client;
    protected GridFS gridFS;

    @Override
    public void close() {
        if (client!=null) {
            client.close();
        }
    }

    @Override
    public void initialize(String blobProviderId, Map<String, String> params) throws IOException {

        this.blobProviderId = blobProviderId;
        String server = params.get("server");
        String dbname = params.get("dbname");
        if (server.startsWith("mongodb://")) {
            // allow mongodb:// URI syntax for the server, to pass everything in one string
            client =  new MongoClient(new MongoClientURI(server));
        } else {
            client =  new MongoClient(new ServerAddress(server));
        }
        gridFS = new GridFS(client.getDB(dbname));
    }

    @Override
    public Blob readBlob(BlobInfo blobInfo) throws IOException {
        return new SimpleManagedBlob(blobInfo);
    }

    @Override
    public InputStream getStream(ManagedBlob blob) throws IOException {
        String key = blob.getKey();
        // strip prefix
        int colon = key.indexOf(':');
        if (colon >= 0 && key.substring(0, colon).equals(blobProviderId)) {
            key = key.substring(colon + 1);
        }

        return null;
    }


    @Override
    public boolean supportsWrite() {
      return true;
    }

    @Override
    public String writeBlob(Blob blob, Document doc) throws IOException {
        return writeAndDigestBlob(blob);
    }


    protected String writeAndDigestBlob(Blob blob) throws IOException  {

        //gridFS.
        return null;
    }
}
