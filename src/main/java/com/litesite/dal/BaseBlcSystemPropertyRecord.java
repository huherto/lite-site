package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcSystemPropertyRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSystemPropertyRecord extends BaseRecord {
    
    @Column(name="BLC_SYSTEM_PROPERTY_ID", sqlType=java.sql.Types.BIGINT)
    public long blcSystemPropertyId;
    
    @Column(name="PROPERTY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String propertyName;
    
    @Column(name="PROPERTY_VALUE", sqlType=java.sql.Types.VARCHAR)
    public String propertyValue;
}
