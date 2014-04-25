package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcFgFeeTaxXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgFeeTaxXrefRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_GROUP_FEE_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupFeeId;
    
    @Column(name="TAX_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long taxDetailId;
}
