package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCategoryProductXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryProductXrefRecord extends BaseRecord {
    
    @Column(name="DISPLAY_ORDER", sqlType=java.sql.Types.BIGINT)
    public Long displayOrder;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryId;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long productId;
}
