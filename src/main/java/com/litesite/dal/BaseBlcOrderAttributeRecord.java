package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcOrderAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderAttributeRecord extends BaseRecord {
    
    @Column(name="ORDER_ATTRIBUTE_ID", sqlType=java.sql.Types.BIGINT)
    public long orderAttributeId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public long orderId;
}
