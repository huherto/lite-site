package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
    
    @Column(name="VALUE", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long productId;
}
