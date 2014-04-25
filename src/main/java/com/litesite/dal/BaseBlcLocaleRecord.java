package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcLocaleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcLocaleRecord extends BaseRecord {
    
    @Column(name="LOCALE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String localeCode;
    
    @Column(name="DEFAULT_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean defaultFlag;
    
    @Column(name="FRIENDLY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String friendlyName;
    
    @Column(name="USE_IN_SEARCH_INDEX", sqlType=java.sql.Types.BOOLEAN)
    public boolean useInSearchIndex;
    
    @Column(name="CURRENCY_CODE", sqlType=java.sql.Types.VARCHAR)
    public String currencyCode;
}
