package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcSandboxItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSandboxItemRecord extends BaseRecord {
    
    @Column(name="SANDBOX_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long sandboxItemId;
    
    @Column(name="ARCHIVED_FLAG", sqlType=java.sql.Types.CHAR)
    public String archivedFlag;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="GRP_DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String grpDescription;
    
    @Column(name="ORIGINAL_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long originalItemId;
    
    @Column(name="ORIG_SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long origSandboxId;
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long sandboxId;
    
    @Column(name="SANDBOX_ITEM_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String sandboxItemType;
    
    @Column(name="SANDBOX_OPERATION_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String sandboxOperationType;
    
    @Column(name="TEMPORARY_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long temporaryItemId;
}
