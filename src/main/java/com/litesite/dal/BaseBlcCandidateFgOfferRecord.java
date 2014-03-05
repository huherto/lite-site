package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcCandidateFgOfferRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCandidateFgOfferRecord extends BaseRecord {
    
    @Column(name="CANDIDATE_FG_OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long candidateFgOfferId;
    
    @Column(name="DISCOUNTED_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal discountedPrice;
    
    @Column(name="FULFILLMENT_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public Long fulfillmentGroupId;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
}
