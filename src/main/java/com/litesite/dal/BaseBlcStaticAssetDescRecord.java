package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcStaticAssetDescRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStaticAssetDescRecord extends BaseRecord {
    
    @Column(name="STATIC_ASSET_DESC_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetDescId;
    
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
    
    @Column(name="LONG_DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String longDescription;
}
