package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcFgItemTaxXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgItemTaxXrefRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_GROUP_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupItemId;
    
    @Column(name="TAX_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long taxDetailId;
}
