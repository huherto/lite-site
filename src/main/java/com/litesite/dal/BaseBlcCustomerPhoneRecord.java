package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCustomerPhoneRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPhoneRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_PHONE_ID", sqlType=java.sql.Types.BIGINT)
    public long customerPhoneId;
    
    @Column(name="PHONE_NAME", sqlType=java.sql.Types.VARCHAR)
    public String phoneName;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="PHONE_ID", sqlType=java.sql.Types.BIGINT)
    public long phoneId;
}
