package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcSearchInterceptRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchInterceptRecord extends BaseRecord {
    
    @Column(name="SEARCH_REDIRECT_ID", sqlType=java.sql.Types.BIGINT)
    public long searchRedirectId;
    
    @Column(name="ACTIVE_END_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeEndDate;
    
    @Column(name="ACTIVE_START_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeStartDate;
    
    @Column(name="PRIORITY", sqlType=java.sql.Types.INTEGER)
    public Integer priority;
    
    @Column(name="SEARCH_TERM", sqlType=java.sql.Types.VARCHAR)
    public String searchTerm;
    
    @Column(name="URL", sqlType=java.sql.Types.VARCHAR)
    public String url;
}
