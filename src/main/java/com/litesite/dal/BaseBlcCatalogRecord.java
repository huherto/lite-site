package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCatalogRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCatalogRecord extends BaseRecord {
    
    @Column(name="CATALOG_ID", sqlType=java.sql.Types.BIGINT)
    public long catalogId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
