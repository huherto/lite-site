package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcOrderItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemRecord extends BaseRecord {
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
    
    @Column(name="DISCOUNTS_ALLOWED", sqlType=java.sql.Types.BOOLEAN)
    public boolean discountsAllowed;
    
    @Column(name="ITEM_TAXABLE_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean itemTaxableFlag;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="ORDER_ITEM_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String orderItemType;
    
    @Column(name="PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal price;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
    
    @Column(name="RETAIL_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal retailPrice;
    
    @Column(name="RETAIL_PRICE_OVERRIDE", sqlType=java.sql.Types.BOOLEAN)
    public boolean retailPriceOverride;
    
    @Column(name="SALE_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal salePrice;
    
    @Column(name="SALE_PRICE_OVERRIDE", sqlType=java.sql.Types.BOOLEAN)
    public boolean salePriceOverride;
    
    @Column(name="TOTAL_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalTax;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long categoryId;
    
    @Column(name="GIFT_WRAP_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long giftWrapItemId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderId;
    
    @Column(name="PERSONAL_MESSAGE_ID", sqlType=java.sql.Types.BIGINT)
    public Long personalMessageId;
}
