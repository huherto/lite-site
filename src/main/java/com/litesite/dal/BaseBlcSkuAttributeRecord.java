package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSkuAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuAttributeRecord extends BaseRecord {
    
    @Column(name="SKU_ATTR_ID", sqlType=java.sql.Types.BIGINT)
    public long skuAttrId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SEARCHABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean searchable;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
}
