package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcGiftCardPaymentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcGiftCardPaymentRecord extends BaseRecord {
    
    @Column(name="PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentId;
    
    @Column(name="PAN", sqlType=java.sql.Types.VARCHAR)
    public String pan;
    
    @Column(name="PIN", sqlType=java.sql.Types.VARCHAR)
    public String pin;
    
    @Column(name="REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String referenceNumber;
}
