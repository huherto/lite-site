package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcProductUpSaleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductUpSaleRecord extends BaseRecord {
    
    @Column(name="UP_SALE_PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long upSaleProductId;
    
    @Column(name="PROMOTION_MESSAGE", sqlType=java.sql.Types.VARCHAR)
    public String promotionMessage;
    
    @Column(name="SEQUENCE", sqlType=java.sql.Types.BIGINT)
    public Long sequence;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long categoryId;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long productId;
    
    @Column(name="RELATED_SALE_PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long relatedSaleProductId;
}
