package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcItemOfferQualifierRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcItemOfferQualifierRecord extends BaseRecord {
    
    @Column(name="ITEM_OFFER_QUALIFIER_ID", sqlType=java.sql.Types.BIGINT)
    public long itemOfferQualifierId;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.BIGINT)
    public Long quantity;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderItemId;
}
