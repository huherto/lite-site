package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFulfillmentPriceBandRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentPriceBandRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_PRICE_BAND_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentPriceBandId;
    
    @Column(name="RESULT_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal resultAmount;
    
    @Column(name="RESULT_AMOUNT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String resultAmountType;
    
    @Column(name="RETAIL_PRICE_MINIMUM_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal retailPriceMinimumAmount;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public Long fulfillmentOptionId;
}
