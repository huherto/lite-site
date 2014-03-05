package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcProductCrossSaleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductCrossSaleRecord extends BaseRecord {
    
    @Column(name="CROSS_SALE_PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long crossSaleProductId;
    
    @Column(name="PROMOTION_MESSAGE", sqlType=java.sql.Types.VARCHAR)
    public String promotionMessage;
    
    @Column(name="SEQUENCE", sqlType=java.sql.Types.BIGINT)
    public Long sequence;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long categoryId;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long productId;
    
    @Column(name="RELATED_SALE_PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long relatedSaleProductId;
}
