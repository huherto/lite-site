package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCategoryImageRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryImageRecord extends BaseRecord {
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryId;
    
    @Column(name="URL", sqlType=java.sql.Types.VARCHAR)
    public String url;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
