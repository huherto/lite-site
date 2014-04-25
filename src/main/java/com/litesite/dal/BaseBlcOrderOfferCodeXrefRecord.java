package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcOrderOfferCodeXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderOfferCodeXrefRecord extends BaseRecord {
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public long orderId;
    
    @Column(name="OFFER_CODE_ID", sqlType=java.sql.Types.BIGINT)
    public long offerCodeId;
}
