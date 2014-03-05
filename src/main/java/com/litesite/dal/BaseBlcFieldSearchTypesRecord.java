package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcFieldSearchTypesRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFieldSearchTypesRecord extends BaseRecord {
    
    @Column(name="FIELD_ID", sqlType=java.sql.Types.BIGINT)
    public long fieldId;
    
    @Column(name="SEARCHABLE_FIELD_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String searchableFieldType;
}
