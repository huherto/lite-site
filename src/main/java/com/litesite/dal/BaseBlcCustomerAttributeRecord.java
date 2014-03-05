package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCustomerAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerAttributeRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_ATTR_ID", sqlType=java.sql.Types.BIGINT)
    public long customerAttrId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="VALUE", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
}
