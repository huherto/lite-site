package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcZipCodeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcZipCodeRecord extends BaseRecord {
    
    @Column(name="ZIP_CODE_ID", sqlType=java.sql.Types.VARCHAR)
    public String zipCodeId;
    
    @Column(name="ZIP_CITY", sqlType=java.sql.Types.VARCHAR)
    public String zipCity;
    
    @Column(name="ZIP_LATITUDE", sqlType=java.sql.Types.DOUBLE)
    public double zipLatitude;
    
    @Column(name="ZIP_LONGITUDE", sqlType=java.sql.Types.DOUBLE)
    public double zipLongitude;
    
    @Column(name="ZIP_STATE", sqlType=java.sql.Types.VARCHAR)
    public String zipState;
    
    @Column(name="ZIPCODE", sqlType=java.sql.Types.INTEGER)
    public Integer zipcode;
}
