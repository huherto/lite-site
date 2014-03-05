package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcCandidateOrderOfferRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCandidateOrderOfferRecord extends BaseRecord {
    
    @Column(name="CANDIDATE_ORDER_OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long candidateOrderOfferId;
    
    @Column(name="DISCOUNTED_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal discountedPrice;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderId;
}
