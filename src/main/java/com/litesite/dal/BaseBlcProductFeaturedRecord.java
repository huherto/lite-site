package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcProductFeaturedRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductFeaturedRecord extends BaseRecord {
    
    @Column(name="FEATURED_PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long featuredProductId;
    
    @Column(name="PROMOTION_MESSAGE", sqlType=java.sql.Types.VARCHAR)
    public String promotionMessage;
    
    @Column(name="SEQUENCE", sqlType=java.sql.Types.BIGINT)
    public Long sequence;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long categoryId;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long productId;
}
