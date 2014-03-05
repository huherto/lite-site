package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;
import java.sql.Timestamp;

/**
 * BaseBlcCategoryRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryRecord extends BaseRecord {
    
    @Column(name="CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public long categoryId;
    
    @Column(name="ACTIVE_END_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeEndDate;
    
    @Column(name="ACTIVE_START_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeStartDate;
    
    @Column(name="ARCHIVED", sqlType=java.sql.Types.CHAR)
    public String archived;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="DISPLAY_TEMPLATE", sqlType=java.sql.Types.VARCHAR)
    public String displayTemplate;
    
    @Column(name="FULFILLMENT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String fulfillmentType;
    
    @Column(name="INVENTORY_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String inventoryType;
    
    @Column(name="LONG_DESCRIPTION", sqlType=java.sql.Types.CLOB)
    public Clob longDescription;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="TAX_CODE", sqlType=java.sql.Types.VARCHAR)
    public String taxCode;
    
    @Column(name="URL", sqlType=java.sql.Types.VARCHAR)
    public String url;
    
    @Column(name="URL_KEY", sqlType=java.sql.Types.VARCHAR)
    public String urlKey;
    
    @Column(name="DEFAULT_PARENT_CATEGORY_ID", sqlType=java.sql.Types.BIGINT)
    public Long defaultParentCategoryId;
}
