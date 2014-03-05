package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFulfillmentWeightBandRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentWeightBandRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_WEIGHT_BAND_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentWeightBandId;
    
    @Column(name="RESULT_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal resultAmount;
    
    @Column(name="RESULT_AMOUNT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String resultAmountType;
    
    @Column(name="MINIMUM_WEIGHT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal minimumWeight;
    
    @Column(name="WEIGHT_UNIT_OF_MEASURE", sqlType=java.sql.Types.VARCHAR)
    public String weightUnitOfMeasure;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public Long fulfillmentOptionId;
}
