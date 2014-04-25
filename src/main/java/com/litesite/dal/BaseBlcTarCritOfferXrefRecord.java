package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcTarCritOfferXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcTarCritOfferXrefRecord extends BaseRecord {
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
    
    @Column(name="OFFER_ITEM_CRITERIA_ID", sqlType=java.sql.Types.BIGINT)
    public long offerItemCriteriaId;
}
