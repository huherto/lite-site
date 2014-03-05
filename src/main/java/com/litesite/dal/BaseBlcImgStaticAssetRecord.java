package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcImgStaticAssetRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcImgStaticAssetRecord extends BaseRecord {
    
    @Column(name="HEIGHT", sqlType=java.sql.Types.INTEGER)
    public Integer height;
    
    @Column(name="WIDTH", sqlType=java.sql.Types.INTEGER)
    public Integer width;
    
    @Column(name="STATIC_ASSET_ID", sqlType=java.sql.Types.BIGINT)
    public long staticAssetId;
}
