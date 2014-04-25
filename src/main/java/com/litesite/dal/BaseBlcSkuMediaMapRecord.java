package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSkuMediaMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuMediaMapRecord extends BaseRecord {
    
    @Column(name="BLC_SKU_SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long blcSkuSkuId;
    
    @Column(name="MEDIA_ID", sqlType=java.sql.Types.BIGINT)
    public long mediaId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
