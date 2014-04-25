package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcOrderItemAdjustmentRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemAdjustmentRecord extends BaseRecord {
    
    @Column(name="ORDER_ITEM_ADJUSTMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemAdjustmentId;
    
    @Column(name="APPLIED_TO_SALE_PRICE", sqlType=java.sql.Types.BOOLEAN)
    public boolean appliedToSalePrice;
    
    @Column(name="ADJUSTMENT_REASON", sqlType=java.sql.Types.VARCHAR)
    public String adjustmentReason;
    
    @Column(name="ADJUSTMENT_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal adjustmentValue;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderItemId;
}
