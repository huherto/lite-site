package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcStoreRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStoreRecord extends BaseRecord {
    
    @Column(name="STORE_ID", sqlType=java.sql.Types.VARCHAR)
    public String storeId;
    
    @Column(name="ADDRESS_1", sqlType=java.sql.Types.VARCHAR)
    public String address1;
    
    @Column(name="ADDRESS_2", sqlType=java.sql.Types.VARCHAR)
    public String address2;
    
    @Column(name="STORE_CITY", sqlType=java.sql.Types.VARCHAR)
    public String storeCity;
    
    @Column(name="STORE_COUNTRY", sqlType=java.sql.Types.VARCHAR)
    public String storeCountry;
    
    @Column(name="LATITUDE", sqlType=java.sql.Types.DOUBLE)
    public double latitude;
    
    @Column(name="LONGITUDE", sqlType=java.sql.Types.DOUBLE)
    public double longitude;
    
    @Column(name="STORE_NAME", sqlType=java.sql.Types.VARCHAR)
    public String storeName;
    
    @Column(name="STORE_PHONE", sqlType=java.sql.Types.VARCHAR)
    public String storePhone;
    
    @Column(name="STORE_STATE", sqlType=java.sql.Types.VARCHAR)
    public String storeState;
    
    @Column(name="STORE_ZIP", sqlType=java.sql.Types.VARCHAR)
    public String storeZip;
}
