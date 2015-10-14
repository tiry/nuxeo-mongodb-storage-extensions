package org.nuxeo.mongodb.directory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelList;
import org.nuxeo.ecm.directory.BaseSession;
import org.nuxeo.ecm.directory.DirectoryException;
import org.nuxeo.ecm.directory.EntrySource;

public class MongoDBSession extends BaseSession implements EntrySource {

    @Override
    public boolean authenticate(String arg0, String arg1) throws DirectoryException {
        // TODO Auto-generated method stub
        // return false;
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() throws DirectoryException {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModel createEntry(Map<String, Object> arg0) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModel createEntry(DocumentModel arg0) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteEntry(DocumentModel arg0) throws DirectoryException {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteEntry(String arg0) throws DirectoryException {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteEntry(String arg0, Map<String, String> arg1) throws DirectoryException {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModelList getEntries() throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModel getEntry(String arg0) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModel getEntry(String arg0, boolean arg1) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public String getIdField() {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public String getPasswordField() {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> getProjection(Map<String, Serializable> arg0, String arg1) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> getProjection(Map<String, Serializable> arg0, Set<String> arg1, String arg2)
            throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasEntry(String arg0) {
        // TODO Auto-generated method stub
        // return false;
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isAuthenticating() throws DirectoryException {
        // TODO Auto-generated method stub
        // return false;
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isReadOnly() {
        // TODO Auto-generated method stub
        // return false;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModelList query(Map<String, Serializable> arg0) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModelList query(Map<String, Serializable> arg0, Set<String> arg1) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModelList query(Map<String, Serializable> arg0, Set<String> arg1, Map<String, String> arg2)
            throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModelList query(Map<String, Serializable> arg0, Set<String> arg1, Map<String, String> arg2,
            boolean arg3) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateEntry(DocumentModel arg0) throws DirectoryException {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public DocumentModel getEntryFromSource(String arg0, boolean arg1) throws DirectoryException {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

}
