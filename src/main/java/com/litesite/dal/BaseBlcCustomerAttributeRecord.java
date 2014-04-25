package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCustomerAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerAttributeRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_ATTR_ID", sqlType=java.sql.Types.BIGINT)
    public long customerAttrId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
}
