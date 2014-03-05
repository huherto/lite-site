package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdditionalOfferInfoRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdditionalOfferInfoRecord extends BaseRecord {
    
    @Column(name="BLC_ORDER_ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public long blcOrderOrderId;
    
    @Column(name="OFFER_INFO_ID", sqlType=java.sql.Types.BIGINT)
    public long offerInfoId;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
}
