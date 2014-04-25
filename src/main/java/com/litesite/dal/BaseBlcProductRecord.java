package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcProductRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductRecord extends BaseRecord {
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long productId;
    
    @Column(name="ARCHIVED", sqlType=java.sql.Types.CHAR)
    public String archived;
    
    @Column(name="CAN_SELL_WITHOUT_OPTIONS", sqlType=java.sql.Types.BOOLEAN)
    public boolean canSellWithoutOptions;
    
    @Column(name="DISPLAY_TEMPLATE", sqlType=java.sql.Types.VARCHAR)
    public String displayTemplate;
    
    @Column(name="IS_FEATURED_PRODUCT", sqlType=java.sql.Types.BOOLEAN)
    public boolean isFeaturedProduct;
    
    @Column(name="MANUFACTURE", sqlType=java.sql.Types.VARCHAR)
    public String manufacture;
    
    @Column(name="MODEL", sqlType=java.sql.Types.VARCHAR)
    public String model;
    
    @Column(name="TAX_CODE", sqlType=java.sql.Types.VARCHAR)
    public String taxCode;
    
    @Column(name="URL", sqlType=java.sql.Types.VARCHAR)
    public String url;
    
    @Column(name="URL_KEY", sqlType=java.sql.Types.VARCHAR)
    public String urlKey;
    
    @Column(name="DEFAULT_CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long defaultCategoryId;
}
