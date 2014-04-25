package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcPageItemCriteriaRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageItemCriteriaRecord extends BaseRecord {
    
    @Column(name="PAGE_ITEM_CRITERIA_ID", sqlType=java.sql.Types.BIGINT)
    public long pageItemCriteriaId;
    
    @Column(name="ORDER_ITEM_MATCH_RULE", sqlType=java.sql.Types.CLOB)
    public Clob orderItemMatchRule;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
}
