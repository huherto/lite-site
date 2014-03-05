package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcOrderItemDtlAdjRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemDtlAdjRecord extends BaseRecord {
    
    @Column(name="ORDER_ITEM_DTL_ADJ_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemDtlAdjId;
    
    @Column(name="APPLIED_TO_SALE_PRICE", sqlType=java.sql.Types.BOOLEAN)
    public boolean appliedToSalePrice;
    
    @Column(name="OFFER_NAME", sqlType=java.sql.Types.VARCHAR)
    public String offerName;
    
    @Column(name="ADJUSTMENT_REASON", sqlType=java.sql.Types.VARCHAR)
    public String adjustmentReason;
    
    @Column(name="ADJUSTMENT_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal adjustmentValue;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="ORDER_ITEM_PRICE_DTL_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderItemPriceDtlId;
}
