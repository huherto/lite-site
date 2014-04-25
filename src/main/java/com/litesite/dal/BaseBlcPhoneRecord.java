package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcPhoneRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPhoneRecord extends BaseRecord {
    
    @Column(name="PHONE_ID", sqlType=java.sql.Types.BIGINT)
    public long phoneId;
    
    @Column(name="IS_ACTIVE", sqlType=java.sql.Types.BOOLEAN)
    public boolean isActive;
    
    @Column(name="IS_DEFAULT", sqlType=java.sql.Types.BOOLEAN)
    public boolean isDefault;
    
    @Column(name="PHONE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String phoneNumber;
}
