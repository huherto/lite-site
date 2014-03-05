package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
