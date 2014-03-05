package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcDiscItemFeePriceRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDiscItemFeePriceRecord extends BaseRecord {
    
    @Column(name="DISC_ITEM_FEE_PRICE_ID", sqlType=java.sql.Types.BIGINT)
    public long discItemFeePriceId;
    
    @Column(name="AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amount;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="REPORTING_CODE", sqlType=java.sql.Types.VARCHAR)
    public String reportingCode;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
}
