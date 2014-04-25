package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCreditCardPaymentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCreditCardPaymentRecord extends BaseRecord {
    
    @Column(name="PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentId;
    
    @Column(name="EXPIRATION_MONTH", sqlType=java.sql.Types.INTEGER)
    public int expirationMonth;
    
    @Column(name="EXPIRATION_YEAR", sqlType=java.sql.Types.INTEGER)
    public int expirationYear;
    
    @Column(name="NAME_ON_CARD", sqlType=java.sql.Types.VARCHAR)
    public String nameOnCard;
    
    @Column(name="PAN", sqlType=java.sql.Types.VARCHAR)
    public String pan;
    
    @Column(name="REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String referenceNumber;
}
