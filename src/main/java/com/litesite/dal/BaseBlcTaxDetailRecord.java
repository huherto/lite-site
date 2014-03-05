package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcTaxDetailRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcTaxDetailRecord extends BaseRecord {
    
    @Column(name="TAX_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long taxDetailId;
    
    @Column(name="AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amount;
    
    @Column(name="TAX_COUNTRY", sqlType=java.sql.Types.VARCHAR)
    public String taxCountry;
    
    @Column(name="JURISDICTION_NAME", sqlType=java.sql.Types.VARCHAR)
    public String jurisdictionName;
    
    @Column(name="RATE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal rate;
    
    @Column(name="TAX_REGION", sqlType=java.sql.Types.VARCHAR)
    public String taxRegion;
    
    @Column(name="TAX_NAME", sqlType=java.sql.Types.VARCHAR)
    public String taxName;
    
    @Column(name="TYPE", sqlType=java.sql.Types.VARCHAR)
    public String type;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
    
    @Column(name="MODULE_CONFIG_ID", sqlType=java.sql.Types.BIGINT)
    public Long moduleConfigId;
}
