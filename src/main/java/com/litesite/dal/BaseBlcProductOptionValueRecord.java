package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcProductOptionValueRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductOptionValueRecord extends BaseRecord {
    
    @Column(name="PRODUCT_OPTION_VALUE_ID", sqlType=java.sql.Types.BIGINT)
    public long productOptionValueId;
    
    @Column(name="ATTRIBUTE_VALUE", sqlType=java.sql.Types.VARCHAR)
    public String attributeValue;
    
    @Column(name="DISPLAY_ORDER", sqlType=java.sql.Types.BIGINT)
    public Long displayOrder;
    
    @Column(name="PRICE_ADJUSTMENT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal priceAdjustment;
    
    @Column(name="PRODUCT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public Long productOptionId;
}
