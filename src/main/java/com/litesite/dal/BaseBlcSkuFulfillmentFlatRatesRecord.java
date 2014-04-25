package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcSkuFulfillmentFlatRatesRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFulfillmentFlatRatesRecord extends BaseRecord {
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
    
    @Column(name="RATE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal rate;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentOptionId;
}
