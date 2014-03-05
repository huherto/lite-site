package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCatSearchFacetExclXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCatSearchFacetExclXrefRecord extends BaseRecord {
    
    @Column(name="CAT_EXCL_SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public long catExclSearchFacetId;
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long categoryId;
    
    @Column(name="SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public Long searchFacetId;
}
