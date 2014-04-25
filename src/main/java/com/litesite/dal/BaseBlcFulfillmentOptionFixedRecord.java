package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFulfillmentOptionFixedRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentOptionFixedRecord extends BaseRecord {
    
    @Column(name="PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal price;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentOptionId;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
}
