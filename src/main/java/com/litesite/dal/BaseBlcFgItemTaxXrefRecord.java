package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
