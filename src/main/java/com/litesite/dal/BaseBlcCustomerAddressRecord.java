package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCustomerAddressRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerAddressRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public long customerAddressId;
    
    @Column(name="ADDRESS_NAME", sqlType=java.sql.Types.VARCHAR)
    public String addressName;
    
    @Column(name="ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public long addressId;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
}
