package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcProductBundleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductBundleRecord extends BaseRecord {
    
    @Column(name="AUTO_BUNDLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean autoBundle;
    
    @Column(name="BUNDLE_PROMOTABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean bundlePromotable;
    
    @Column(name="ITEMS_PROMOTABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean itemsPromotable;
    
    @Column(name="PRICING_MODEL", sqlType=java.sql.Types.VARCHAR)
    public String pricingModel;
    
    @Column(name="BUNDLE_PRIORITY", sqlType=java.sql.Types.INTEGER)
    public Integer bundlePriority;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long productId;
}
