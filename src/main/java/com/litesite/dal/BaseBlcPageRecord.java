package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcPageRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageRecord extends BaseRecord {
    
    @Column(name="PAGE_ID", sqlType=java.sql.Types.BIGINT)
    public long pageId;
    
    @Column(name="ARCHIVED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean archivedFlag;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="DELETED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean deletedFlag;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="FULL_URL", sqlType=java.sql.Types.VARCHAR)
    public String fullUrl;
    
    @Column(name="LOCKED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean lockedFlag;
    
    @Column(name="OFFLINE_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean offlineFlag;
    
    @Column(name="ORIG_PAGE_ID", sqlType=java.sql.Types.BIGINT)
    public Long origPageId;
    
    @Column(name="PRIORITY", sqlType=java.sql.Types.INTEGER)
    public Integer priority;
    
    @Column(name="ORIG_SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long origSandboxId;
    
    @Column(name="PAGE_TMPLT_ID", sqlType=java.sql.Types.BIGINT)
    public Long pageTmpltId;
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long sandboxId;
}
