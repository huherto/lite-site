package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFgAdjustmentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgAdjustmentRecord extends BaseRecord {
    
    @Column(name="FG_ADJUSTMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long fgAdjustmentId;
    
    @Column(name="ADJUSTMENT_REASON", sqlType=java.sql.Types.VARCHAR)
    public String adjustmentReason;
    
    @Column(name="ADJUSTMENT_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal adjustmentValue;
    
    @Column(name="FULFILLMENT_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public Long fulfillmentGroupId;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
}
