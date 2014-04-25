package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * BaseBlcOrderPaymentDetailsRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderPaymentDetailsRecord extends BaseRecord {
    
    @Column(name="PAYMENT_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentDetailId;
    
    @Column(name="PAYMENT_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal paymentAmount;
    
    @Column(name="DATE_RECORDED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateRecorded;
    
    @Column(name="PAYMENT_INFO_DETAIL_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String paymentInfoDetailType;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
    
    @Column(name="PAYMENT_INFO", sqlType=java.sql.Types.BIGINT)
    public long paymentInfo;
}
