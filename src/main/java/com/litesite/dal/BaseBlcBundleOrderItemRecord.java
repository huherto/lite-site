package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcBundleOrderItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcBundleOrderItemRecord extends BaseRecord {
    
    @Column(name="BASE_RETAIL_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal baseRetailPrice;
    
    @Column(name="BASE_SALE_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal baseSalePrice;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
    
    @Column(name="PRODUCT_BUNDLE_ID", sqlType=java.sql.Types.BIGINT)
    public Long productBundleId;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public Long skuId;
}
