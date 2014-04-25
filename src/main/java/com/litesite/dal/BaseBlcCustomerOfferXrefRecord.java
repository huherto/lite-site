package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCustomerOfferXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerOfferXrefRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerOfferId;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
}
