package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSearchFacetXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchFacetXrefRecord extends BaseRecord {
    
    @Column(name="ID", sqlType=java.sql.Types.BIGINT)
    public long id;
    
    @Column(name="REQUIRED_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public long requiredFacetId;
    
    @Column(name="SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public Long searchFacetId;
}
