package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;
import java.sql.Clob;

/**
 * BaseBlcSkuFeeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFeeRecord extends BaseRecord {
    
    @Column(name="SKU_FEE_ID", sqlType=java.sql.Types.BIGINT)
    public long skuFeeId;
    
    @Column(name="AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amount;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="EXPRESSION", sqlType=java.sql.Types.CLOB)
    public Clob expression;
    
    @Column(name="FEE_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String feeType;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="TAXABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean taxable;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
}
