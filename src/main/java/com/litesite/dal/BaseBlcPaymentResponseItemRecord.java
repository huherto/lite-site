package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * BaseBlcPaymentResponseItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPaymentResponseItemRecord extends BaseRecord {
    
    @Column(name="PAYMENT_RESPONSE_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentResponseItemId;
    
    @Column(name="AMOUNT_PAID", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amountPaid;
    
    @Column(name="AUTHORIZATION_CODE", sqlType=java.sql.Types.VARCHAR)
    public String authorizationCode;
    
    @Column(name="AVS_CODE", sqlType=java.sql.Types.VARCHAR)
    public String avsCode;
    
    @Column(name="IMPLEMENTOR_RESPONSE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String implementorResponseCode;
    
    @Column(name="IMPLEMENTOR_RESPONSE_TEXT", sqlType=java.sql.Types.VARCHAR)
    public String implementorResponseText;
    
    @Column(name="MIDDLEWARE_RESPONSE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String middlewareResponseCode;
    
    @Column(name="MIDDLEWARE_RESPONSE_TEXT", sqlType=java.sql.Types.VARCHAR)
    public String middlewareResponseText;
    
    @Column(name="ORDER_PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderPaymentId;
    
    @Column(name="PAYMENT_INFO_REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String paymentInfoReferenceNumber;
    
    @Column(name="PROCESSOR_RESPONSE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String processorResponseCode;
    
    @Column(name="PROCESSOR_RESPONSE_TEXT", sqlType=java.sql.Types.VARCHAR)
    public String processorResponseText;
    
    @Column(name="REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String referenceNumber;
    
    @Column(name="REMAINING_BALANCE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal remainingBalance;
    
    @Column(name="TRANSACTION_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal transactionAmount;
    
    @Column(name="TRANSACTION_ID", sqlType=java.sql.Types.VARCHAR)
    public String transactionId;
    
    @Column(name="TRANSACTION_SUCCESS", sqlType=java.sql.Types.BOOLEAN)
    public boolean transactionSuccess;
    
    @Column(name="TRANSACTION_TIMESTAMP", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp transactionTimestamp;
    
    @Column(name="TRANSACTION_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String transactionType;
    
    @Column(name="USER_NAME", sqlType=java.sql.Types.VARCHAR)
    public String userName;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public Long customerId;
}
