package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFulfillmentGroupFeeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentGroupFeeRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_GROUP_FEE_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupFeeId;
    
    @Column(name="AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amount;
    
    @Column(name="FEE_TAXABLE_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean feeTaxableFlag;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="REPORTING_CODE", sqlType=java.sql.Types.VARCHAR)
    public String reportingCode;
    
    @Column(name="TOTAL_FEE_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalFeeTax;
    
    @Column(name="FULFILLMENT_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupId;
}
