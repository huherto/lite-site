package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcOrderItemPriceDtlRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemPriceDtlRecord extends BaseRecord {
    
    @Column(name="ORDER_ITEM_PRICE_DTL_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemPriceDtlId;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
    
    @Column(name="USE_SALE_PRICE", sqlType=java.sql.Types.BOOLEAN)
    public boolean useSalePrice;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderItemId;
}
