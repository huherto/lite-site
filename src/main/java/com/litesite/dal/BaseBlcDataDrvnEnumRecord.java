package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcDataDrvnEnumRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDataDrvnEnumRecord extends BaseRecord {
    
    @Column(name="ENUM_ID", sqlType=java.sql.Types.BIGINT)
    public long enumId;
    
    @Column(name="ENUM_KEY", sqlType=java.sql.Types.VARCHAR)
    public String enumKey;
    
    @Column(name="MODIFIABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean modifiable;
}
