package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcOrderAdjustmentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderAdjustmentRecord extends BaseRecord {
    
    @Column(name="ORDER_ADJUSTMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long orderAdjustmentId;
    
    @Column(name="ADJUSTMENT_REASON", sqlType=java.sql.Types.VARCHAR)
    public String adjustmentReason;
    
    @Column(name="ADJUSTMENT_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal adjustmentValue;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderId;
}
