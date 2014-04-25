package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCategoryAttributeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryAttributeRecord extends BaseRecord {
    
    @Column(name="CATEGORY_ATTRIBUTE_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryAttributeId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SEARCHABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean searchable;
    
    @Column(name="&quot;VALUE&quot;", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryId;
}
