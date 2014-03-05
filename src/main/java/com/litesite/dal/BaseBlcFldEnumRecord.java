package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcFldEnumRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldEnumRecord extends BaseRecord {
    
    @Column(name="FLD_ENUM_ID", sqlType=java.sql.Types.BIGINT)
    public long fldEnumId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
