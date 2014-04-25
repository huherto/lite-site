package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcBankAccountPaymentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcBankAccountPaymentRecord extends BaseRecord {
    
    @Column(name="PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentId;
    
    @Column(name="ACCOUNT_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String accountNumber;
    
    @Column(name="REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String referenceNumber;
    
    @Column(name="ROUTING_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String routingNumber;
}
