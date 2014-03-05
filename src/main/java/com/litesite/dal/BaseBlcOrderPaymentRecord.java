package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcOrderPaymentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderPaymentRecord extends BaseRecord {
    
    @Column(name="PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentId;
    
    @Column(name="AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amount;
    
    @Column(name="CUSTOMER_IP_ADDRESS", sqlType=java.sql.Types.VARCHAR)
    public String customerIpAddress;
    
    @Column(name="REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String referenceNumber;
    
    @Column(name="PAYMENT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String paymentType;
    
    @Column(name="ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public Long addressId;
    
    @Column(name="CUSTOMER_PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public Long customerPaymentId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public long orderId;
    
    @Column(name="PHONE_ID", sqlType=java.sql.Types.BIGINT)
    public Long phoneId;
}
