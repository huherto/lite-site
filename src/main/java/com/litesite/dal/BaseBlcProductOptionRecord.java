package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcProductOptionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductOptionRecord extends BaseRecord {
    
    @Column(name="PRODUCT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long productOptionId;
    
    @Column(name="ATTRIBUTE_NAME", sqlType=java.sql.Types.VARCHAR)
    public String attributeName;
    
    @Column(name="DISPLAY_ORDER", sqlType=java.sql.Types.INTEGER)
    public Integer displayOrder;
    
    @Column(name="ERROR_CODE", sqlType=java.sql.Types.VARCHAR)
    public String errorCode;
    
    @Column(name="ERROR_MESSAGE", sqlType=java.sql.Types.VARCHAR)
    public String errorMessage;
    
    @Column(name="LABEL", sqlType=java.sql.Types.VARCHAR)
    public String label;
    
    @Column(name="VALIDATION_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String validationType;
    
    @Column(name="REQUIRED", sqlType=java.sql.Types.BOOLEAN)
    public boolean required;
    
    @Column(name="OPTION_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String optionType;
    
    @Column(name="USE_IN_SKU_GENERATION", sqlType=java.sql.Types.BOOLEAN)
    public boolean useInSkuGeneration;
    
    @Column(name="VALIDATION_STRING", sqlType=java.sql.Types.VARCHAR)
    public String validationString;
}
