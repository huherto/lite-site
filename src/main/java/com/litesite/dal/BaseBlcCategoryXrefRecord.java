package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCategoryXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryXrefRecord extends BaseRecord {
    
    @Column(name="DISPLAY_ORDER", sqlType=java.sql.Types.BIGINT)
    public Long displayOrder;
    
    @Column(name="SUB_CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long subCategoryId;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryId;
}
