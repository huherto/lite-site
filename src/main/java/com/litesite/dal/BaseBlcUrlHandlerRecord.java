package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcUrlHandlerRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcUrlHandlerRecord extends BaseRecord {
    
    @Column(name="URL_HANDLER_ID", sqlType=java.sql.Types.BIGINT)
    public long urlHandlerId;
    
    @Column(name="INCOMING_URL", sqlType=java.sql.Types.VARCHAR)
    public String incomingUrl;
    
    @Column(name="NEW_URL", sqlType=java.sql.Types.VARCHAR)
    public String newUrl;
    
    @Column(name="URL_REDIRECT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String urlRedirectType;
}
