package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcSearchFacetRangeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchFacetRangeRecord extends BaseRecord {
    
    @Column(name="SEARCH_FACET_RANGE_ID", sqlType=java.sql.Types.BIGINT)
    public long searchFacetRangeId;
    
    @Column(name="MAX_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal maxValue;
    
    @Column(name="MIN_VALUE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal minValue;
    
    @Column(name="SEARCH_FACET_ID", sqlType=java.sql.Types.BIGINT)
    public Long searchFacetId;
}
