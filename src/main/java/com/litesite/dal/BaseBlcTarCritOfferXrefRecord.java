package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
