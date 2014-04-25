package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcPaymentAdditionalFieldsRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPaymentAdditionalFieldsRecord extends BaseRecord {
    
    @Column(name="PAYMENT_RESPONSE_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long paymentResponseItemId;
    
    @Column(name="FIELD_VALUE", sqlType=java.sql.Types.VARCHAR)
    public String fieldValue;
    
    @Column(name="FIELD_NAME", sqlType=java.sql.Types.VARCHAR)
    public String fieldName;
}
