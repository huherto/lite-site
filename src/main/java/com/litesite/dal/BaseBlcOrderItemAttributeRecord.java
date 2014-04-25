package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcOrderItemAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemAttributeRecord extends BaseRecord {
    
    @Column(name="ORDER_ITEM_ATTRIBUTE_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemAttributeId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
}
