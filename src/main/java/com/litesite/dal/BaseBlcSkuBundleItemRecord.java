package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcSkuBundleItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuBundleItemRecord extends BaseRecord {
    
    @Column(name="SKU_BUNDLE_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long skuBundleItemId;
    
    @Column(name="ITEM_SALE_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal itemSalePrice;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
    
    @Column(name="PRODUCT_BUNDLE_ID", sqlType=java.sql.Types.BIGINT)
    public long productBundleId;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
}
