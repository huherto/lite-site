package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCategoryMediaMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryMediaMapRecord extends BaseRecord {
    
    @Column(name="BLC_CATEGORY_CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long blcCategoryCategoryId;
    
    @Column(name="MEDIA_ID", sqlType=java.sql.Types.BIGINT)
    public long mediaId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
