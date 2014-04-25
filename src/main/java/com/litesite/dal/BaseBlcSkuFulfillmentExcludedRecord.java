package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSkuFulfillmentExcludedRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFulfillmentExcludedRecord extends BaseRecord {
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentOptionId;
}
