package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcScRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScRecord extends BaseRecord {
    
    @Column(name="SC_ID", sqlType=java.sql.Types.BIGINT)
    public long scId;
    
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
    
    @Column(name="CONTENT_NAME", sqlType=java.sql.Types.VARCHAR)
    public String contentName;
    
    @Column(name="DELETED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean deletedFlag;
    
    @Column(name="LOCKED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean lockedFlag;
    
    @Column(name="OFFLINE_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean offlineFlag;
    
    @Column(name="ORIG_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long origItemId;
    
    @Column(name="PRIORITY", sqlType=java.sql.Types.INTEGER)
    public int priority;
    
    @Column(name="LOCALE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String localeCode;
    
    @Column(name="ORIG_SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long origSandboxId;
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long sandboxId;
    
    @Column(name="SC_TYPE_ID", sqlType=java.sql.Types.BIGINT)
    public Long scTypeId;
}
