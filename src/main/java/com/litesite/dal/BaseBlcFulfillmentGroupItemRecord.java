package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFulfillmentGroupItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentGroupItemRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_GROUP_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupItemId;
    
    @Column(name="PRORATED_ORDER_ADJ", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal proratedOrderAdj;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.INTEGER)
    public int quantity;
    
    @Column(name="STATUS", sqlType=java.sql.Types.VARCHAR)
    public String status;
    
    @Column(name="TOTAL_ITEM_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalItemAmount;
    
    @Column(name="TOTAL_ITEM_TAXABLE_AMOUNT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalItemTaxableAmount;
    
    @Column(name="TOTAL_ITEM_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalItemTax;
    
    @Column(name="FULFILLMENT_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupId;
    
    @Column(name="ORDER_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long orderItemId;
}
