package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * BaseBlcPaymentLogRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPaymentLogRecord extends BaseRecord {
    
    @Column(name="PAYMENT_LOG_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentLogId;
    
    @Column(name="AMOUNT_PAID", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amountPaid;
    
    @Column(name="EXCEPTION_MESSAGE", sqlType=java.sql.Types.VARCHAR)
    public String exceptionMessage;
    
    @Column(name="LOG_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String logType;
    
    @Column(name="ORDER_PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderPaymentId;
    
    @Column(name="PAYMENT_INFO_REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String paymentInfoReferenceNumber;
    
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
