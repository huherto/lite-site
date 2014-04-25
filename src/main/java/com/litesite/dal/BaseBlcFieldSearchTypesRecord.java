package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

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
