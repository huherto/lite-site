package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcDiscreteOrderItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDiscreteOrderItemRecord extends BaseRecord {
    
    @Column(name="BASE_RETAIL_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal baseRetailPrice;
    
    @Column(name="BASE_SALE_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal baseSalePrice;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
    
    @Column(name="BUNDLE_ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long bundleOrderItemId;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long productId;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
    
    @Column(name="SKU_BUNDLE_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long skuBundleItemId;
}
