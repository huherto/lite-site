package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcOrderMultishipOptionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderMultishipOptionRecord extends BaseRecord {
    
    @Column(name="ORDER_MULTISHIP_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long orderMultishipOptionId;
    
    @Column(name="ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public Long addressId;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public Long fulfillmentOptionId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderId;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderItemId;
}
