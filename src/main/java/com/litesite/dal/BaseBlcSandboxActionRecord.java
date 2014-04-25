package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcSandboxActionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSandboxActionRecord extends BaseRecord {
    
    @Column(name="SANDBOX_ACTION_ID", sqlType=java.sql.Types.BIGINT)
    public long sandboxActionId;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="ACTION_COMMENT", sqlType=java.sql.Types.VARCHAR)
    public String actionComment;
    
    @Column(name="ACTION_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String actionType;
}
