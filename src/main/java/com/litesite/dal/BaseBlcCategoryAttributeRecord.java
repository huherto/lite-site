package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
    
    @Column(name="VALUE", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryId;
}
