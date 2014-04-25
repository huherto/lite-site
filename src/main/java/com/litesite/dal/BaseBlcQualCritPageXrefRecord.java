package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcQualCritPageXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcQualCritPageXrefRecord extends BaseRecord {
    
    @Column(name="PAGE_ID", sqlType=java.sql.Types.BIGINT)
    public long pageId;
    
    @Column(name="PAGE_ITEM_CRITERIA_ID", sqlType=java.sql.Types.BIGINT)
    public long pageItemCriteriaId;
}
