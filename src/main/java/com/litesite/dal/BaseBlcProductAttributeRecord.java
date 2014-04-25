package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcProductAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductAttributeRecord extends BaseRecord {
    
    @Column(name="PRODUCT_ATTRIBUTE_ID", sqlType=java.sql.Types.BIGINT)
    public long productAttributeId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SEARCHABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean searchable;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long productId;
}
