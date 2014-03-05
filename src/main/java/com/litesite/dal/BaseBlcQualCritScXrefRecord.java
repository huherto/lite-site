package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcQualCritScXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcQualCritScXrefRecord extends BaseRecord {
    
    @Column(name="SC_ID", sqlType=java.sql.Types.BIGINT)
    public long scId;
    
    @Column(name="SC_ITEM_CRITERIA_ID", sqlType=java.sql.Types.BIGINT)
    public long scItemCriteriaId;
}
