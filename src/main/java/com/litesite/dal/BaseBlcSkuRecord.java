package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Timestamp;

/**
 * BaseBlcSkuRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuRecord extends BaseRecord {
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
    
    @Column(name="ACTIVE_END_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeEndDate;
    
    @Column(name="ACTIVE_START_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeStartDate;
    
    @Column(name="AVAILABLE_FLAG", sqlType=java.sql.Types.CHAR)
    public String availableFlag;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="CONTAINER_SHAPE", sqlType=java.sql.Types.VARCHAR)
    public String containerShape;
    
    @Column(name="DEPTH", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal depth;
    
    @Column(name="DIMENSION_UNIT_OF_MEASURE", sqlType=java.sql.Types.VARCHAR)
    public String dimensionUnitOfMeasure;
    
    @Column(name="GIRTH", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal girth;
    
    @Column(name="HEIGHT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal height;
    
    @Column(name="CONTAINER_SIZE", sqlType=java.sql.Types.VARCHAR)
    public String containerSize;
    
    @Column(name="WIDTH", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal width;
    
    @Column(name="DISCOUNTABLE_FLAG", sqlType=java.sql.Types.CHAR)
    public String discountableFlag;
    
    @Column(name="FULFILLMENT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String fulfillmentType;
    
    @Column(name="INVENTORY_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String inventoryType;
    
    @Column(name="IS_MACHINE_SORTABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean isMachineSortable;
    
    @Column(name="LONG_DESCRIPTION", sqlType=java.sql.Types.CLOB)
    public Clob longDescription;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="RETAIL_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal retailPrice;
    
    @Column(name="SALE_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal salePrice;
    
    @Column(name="TAX_CODE", sqlType=java.sql.Types.VARCHAR)
    public String taxCode;
    
    @Column(name="TAXABLE_FLAG", sqlType=java.sql.Types.CHAR)
    public String taxableFlag;
    
    @Column(name="WEIGHT", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal weight;
    
    @Column(name="WEIGHT_UNIT_OF_MEASURE", sqlType=java.sql.Types.VARCHAR)
    public String weightUnitOfMeasure;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
    
    @Column(name="DEFAULT_PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long defaultProductId;
}
