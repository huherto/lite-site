package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
