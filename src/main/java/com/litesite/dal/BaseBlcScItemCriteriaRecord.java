package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcScItemCriteriaRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScItemCriteriaRecord extends BaseRecord {
    
    @Column(name="SC_ITEM_CRITERIA_ID", sqlType=java.sql.Types.BIGINT)
    public long scItemCriteriaId;
    
    @Column(name="ORDER_ITEM_MATCH_RULE", sqlType=java.sql.Types.CLOB)
    public Clob orderItemMatchRule;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
}
