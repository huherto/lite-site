package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcFgFgTaxXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgFgTaxXrefRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupId;
    
    @Column(name="TAX_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long taxDetailId;
}
