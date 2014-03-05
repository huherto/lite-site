package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * BaseBlcOrderRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderRecord extends BaseRecord {
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public long orderId;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="EMAIL_ADDRESS", sqlType=java.sql.Types.VARCHAR)
    public String emailAddress;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="ORDER_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String orderNumber;
    
    @Column(name="ORDER_STATUS", sqlType=java.sql.Types.VARCHAR)
    public String orderStatus;
    
    @Column(name="ORDER_SUBTOTAL", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal orderSubtotal;
    
    @Column(name="SUBMIT_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp submitDate;
    
    @Column(name="ORDER_TOTAL", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal orderTotal;
    
    @Column(name="TOTAL_SHIPPING", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalShipping;
    
    @Column(name="TOTAL_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalTax;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="LOCALE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String localeCode;
}
