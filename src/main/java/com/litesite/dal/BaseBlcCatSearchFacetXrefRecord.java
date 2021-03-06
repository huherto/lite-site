package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCatSearchFacetXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCatSearchFacetXrefRecord extends BaseRecord {
    
    @Column(name="CATEGORY_SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public long categorySearchFacetId;
    
    @Column(name="SEQUENCE", sqlType=java.sql.Types.BIGINT)
    public Long sequence;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long categoryId;
    
    @Column(name="SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public Long searchFacetId;
}
