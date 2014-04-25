package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcPayinfoAdditionalFieldsRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPayinfoAdditionalFieldsRecord extends BaseRecord {
    
    @Column(name="PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentId;
    
    @Column(name="FIELD_VALUE", sqlType=java.sql.Types.VARCHAR)
    public String fieldValue;
    
    @Column(name="FIELD_NAME", sqlType=java.sql.Types.VARCHAR)
    public String fieldName;
}
