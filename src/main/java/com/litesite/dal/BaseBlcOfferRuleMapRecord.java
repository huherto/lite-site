package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcOfferRuleMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferRuleMapRecord extends BaseRecord {
    
    @Column(name="BLC_OFFER_OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long blcOfferOfferId;
    
    @Column(name="OFFER_RULE_ID", sqlType=java.sql.Types.BIGINT)
    public long offerRuleId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
