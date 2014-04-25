package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcBundItemFeePriceRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcBundItemFeePriceRecord extends BaseRecord {
    
    @Column(name="BUND_ITEM_FEE_PRICE_ID", sqlType=java.sql.Types.BIGINT)
    public long bundItemFeePriceId;
    
    @Column(name="AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal amount;
    
    @Column(name="IS_TAXABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean isTaxable;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="REPORTING_CODE", sqlType=java.sql.Types.VARCHAR)
    public String reportingCode;
    
    @Column(name="BUND_ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long bundOrderItemId;
}
