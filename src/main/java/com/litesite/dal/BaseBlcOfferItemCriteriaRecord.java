package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcOfferItemCriteriaRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferItemCriteriaRecord extends BaseRecord {
    
    @Column(name="OFFER_ITEM_CRITERIA_ID", sqlType=java.sql.Types.BIGINT)
    public long offerItemCriteriaId;
    
    @Column(name="ORDER_ITEM_MATCH_RULE", sqlType=java.sql.Types.CLOB)
    public Clob orderItemMatchRule;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
}
