package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcCandidateItemOfferRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCandidateItemOfferRecord extends BaseRecord {
    
    @Column(name="CANDIDATE_ITEM_OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long candidateItemOfferId;
    
    @Column(name="DISCOUNTED_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal discountedPrice;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderItemId;
}
