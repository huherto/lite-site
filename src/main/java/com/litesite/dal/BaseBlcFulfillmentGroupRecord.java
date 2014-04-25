package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcFulfillmentGroupRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentGroupRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentGroupId;
    
    @Column(name="DELIVERY_INSTRUCTION", sqlType=java.sql.Types.VARCHAR)
    public String deliveryInstruction;
    
    @Column(name="PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal price;
    
    @Column(name="SHIPPING_PRICE_TAXABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean shippingPriceTaxable;
    
    @Column(name="MERCHANDISE_TOTAL", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal merchandiseTotal;
    
    @Column(name="&quot;METHOD&quot;", sqlType=java.sql.Types.VARCHAR)
    public String method;
    
    @Column(name="IS_PRIMARY", sqlType=java.sql.Types.BOOLEAN)
    public boolean isPrimary;
    
    @Column(name="REFERENCE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String referenceNumber;
    
    @Column(name="RETAIL_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal retailPrice;
    
    @Column(name="SALE_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal salePrice;
    
    @Column(name="FULFILLMENT_GROUP_SEQUNCE", sqlType=java.sql.Types.INTEGER)
    public Integer fulfillmentGroupSequnce;
    
    @Column(name="SERVICE", sqlType=java.sql.Types.VARCHAR)
    public String service;
    
    @Column(name="STATUS", sqlType=java.sql.Types.VARCHAR)
    public String status;
    
    @Column(name="TOTAL", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal total;
    
    @Column(name="TOTAL_FEE_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalFeeTax;
    
    @Column(name="TOTAL_FG_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalFgTax;
    
    @Column(name="TOTAL_ITEM_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalItemTax;
    
    @Column(name="TOTAL_TAX", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal totalTax;
    
    @Column(name="TYPE", sqlType=java.sql.Types.VARCHAR)
    public String type;
    
    @Column(name="ADDRESS_ID", sqlType=java.sql.Types.BIGINT)
    public Long addressId;
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public Long fulfillmentOptionId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public long orderId;
    
    @Column(name="PERSONAL_MESSAGE_ID", sqlType=java.sql.Types.BIGINT)
    public Long personalMessageId;
    
    @Column(name="PHONE_ID", sqlType=java.sql.Types.BIGINT)
    public Long phoneId;
}
