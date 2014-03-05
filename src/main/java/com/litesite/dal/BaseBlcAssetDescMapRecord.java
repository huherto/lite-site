package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAssetDescMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAssetDescMapRecord extends BaseRecord {
    
    @Column(name="STATIC_ASSET_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetId;
    
    @Column(name="STATIC_ASSET_DESC_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetDescId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
