package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCustomerPaymentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPaymentRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long customerPaymentId;
    
    @Column(name="IS_DEFAULT", sqlType=java.sql.Types.BOOLEAN)
    public boolean isDefault;
    
    @Column(name="PAYMENT_TOKEN", sqlType=java.sql.Types.VARCHAR)
    public String paymentToken;
    
    @Column(name="ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public long addressId;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
}
