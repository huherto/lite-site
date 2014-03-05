package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
