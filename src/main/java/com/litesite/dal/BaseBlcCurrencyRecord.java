package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCurrencyRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCurrencyRecord extends BaseRecord {
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
    
    @Column(name="DEFAULT_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean defaultFlag;
    
    @Column(name="FRIENDLY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String friendlyName;
}
