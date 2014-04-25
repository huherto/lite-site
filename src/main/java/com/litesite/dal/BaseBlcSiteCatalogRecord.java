package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSiteCatalogRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSiteCatalogRecord extends BaseRecord {
    
    @Column(name="CATALOG_ID", sqlType=java.sql.Types.BIGINT)
    public long catalogId;
    
    @Column(name="SITE_ID", sqlType=java.sql.Types.BIGINT)
    public long siteId;
}
