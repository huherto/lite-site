package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcOfferRuleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferRuleRecord extends BaseRecord {
    
    @Column(name="OFFER_RULE_ID", sqlType=java.sql.Types.BIGINT)
    public long offerRuleId;
    
    @Column(name="MATCH_RULE", sqlType=java.sql.Types.CLOB)
    public Clob matchRule;
}
