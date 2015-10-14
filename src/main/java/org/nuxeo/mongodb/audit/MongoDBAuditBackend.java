package org.nuxeo.mongodb.audit;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.nuxeo.ecm.platform.audit.api.ExtendedInfo;
import org.nuxeo.ecm.platform.audit.api.FilterMapEntry;
import org.nuxeo.ecm.platform.audit.api.LogEntry;
import org.nuxeo.ecm.platform.audit.service.AbstractAuditBackend;
import org.nuxeo.ecm.platform.audit.service.AuditBackend;

public class MongoDBAuditBackend extends AbstractAuditBackend implements AuditBackend {

    @Override
    public List<LogEntry> getLogEntriesFor(String arg0, Map<String, FilterMapEntry> arg1, boolean arg2) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public LogEntry getLogEntryByID(long arg0) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public List<?> nativeQuery(String arg0, Map<String, Object> arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public List<LogEntry> queryLogsByPage(String[] arg0, String arg1, String[] arg2, String arg3, int arg4, int arg5) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public List<LogEntry> queryLogsByPage(String[] arg0, Date arg1, String[] arg2, String arg3, int arg4, int arg5) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public void addLogEntries(List<LogEntry> arg0) {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getEventsCount(String arg0) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public long syncLogCreationEntries(String arg0, String arg1, Boolean arg2) {
        // TODO Auto-generated method stub
        // return 0;
        throw new UnsupportedOperationException();
    }

    @Override
    public void deactivate() {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public void onApplicationStarted() {
        // TODO Auto-generated method stub
        // 
        throw new UnsupportedOperationException();
    }

    @Override
    public ExtendedInfo newExtendedInfo(Serializable arg0) {
        // TODO Auto-generated method stub
        // return null;
        throw new UnsupportedOperationException();
    }

}
