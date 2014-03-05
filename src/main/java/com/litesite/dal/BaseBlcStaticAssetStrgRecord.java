package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Blob;

/**
 * BaseBlcStaticAssetStrgRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStaticAssetStrgRecord extends BaseRecord {
    
    @Column(name="STATIC_ASSET_STRG_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetStrgId;
    
    @Column(name="FILE_DATA", sqlType=java.sql.Types.BLOB)
    public Blob fileData;
    
    @Column(name="STATIC_ASSET_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetId;
}
