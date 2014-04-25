package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcStaticAssetRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStaticAssetRecord extends BaseRecord {
    
    @Column(name="STATIC_ASSET_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetId;
    
    @Column(name="ALT_TEXT", sqlType=java.sql.Types.VARCHAR)
    public String altText;
    
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
    
    @Column(name="FILE_EXTENSION", sqlType=java.sql.Types.VARCHAR)
    public String fileExtension;
    
    @Column(name="FILE_SIZE", sqlType=java.sql.Types.BIGINT)
    public Long fileSize;
    
    @Column(name="FULL_URL", sqlType=java.sql.Types.VARCHAR)
    public String fullUrl;
    
    @Column(name="LOCKED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean lockedFlag;
    
    @Column(name="MIME_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String mimeType;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="ORIG_ASSET_ID", sqlType=java.sql.Types.BIGINT)
    public Long origAssetId;
    
    @Column(name="STORAGE_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String storageType;
    
    @Column(name="TITLE", sqlType=java.sql.Types.VARCHAR)
    public String title;
    
    @Column(name="ORIG_SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long origSandboxId;
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long sandboxId;
}
