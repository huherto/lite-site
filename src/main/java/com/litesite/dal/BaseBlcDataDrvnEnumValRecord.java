package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcDataDrvnEnumValRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDataDrvnEnumValRecord extends BaseRecord {
    
    @Column(name="ENUM_VAL_ID", sqlType=java.sql.Types.BIGINT)
    public long enumValId;
    
    @Column(name="DISPLAY", sqlType=java.sql.Types.VARCHAR)
    public String display;
    
    @Column(name="HIDDEN", sqlType=java.sql.Types.BOOLEAN)
    public boolean hidden;
    
    @Column(name="ENUM_KEY", sqlType=java.sql.Types.VARCHAR)
    public String enumKey;
    
    @Column(name="ENUM_TYPE", sqlType=java.sql.Types.BIGINT)
    public Long enumType;
}
