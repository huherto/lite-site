package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcOrderItemAddAttrRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemAddAttrRecord extends BaseRecord {
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
