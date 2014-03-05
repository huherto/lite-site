package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcOfferInfoFieldsRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferInfoFieldsRecord extends BaseRecord {
    
    @Column(name="OFFER_INFO_FIELDS_ID", sqlType=java.sql.Types.BIGINT)
    public long offerInfoFieldsId;
    
    @Column(name="FIELD_VALUE", sqlType=java.sql.Types.VARCHAR)
    public String fieldValue;
    
    @Column(name="FIELD_NAME", sqlType=java.sql.Types.VARCHAR)
    public String fieldName;
}
