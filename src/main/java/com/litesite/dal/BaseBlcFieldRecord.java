package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcFieldRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFieldRecord extends BaseRecord {
    
    @Column(name="FIELD_ID", sqlType=java.sql.Types.BIGINT)
    public long fieldId;
    
    @Column(name="ABBREVIATION", sqlType=java.sql.Types.VARCHAR)
    public String abbreviation;
    
    @Column(name="ENTITY_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String entityType;
    
    @Column(name="FACET_FIELD_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String facetFieldType;
    
    @Column(name="PROPERTY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String propertyName;
    
    @Column(name="SEARCHABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean searchable;
    
    @Column(name="TRANSLATABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean translatable;
}
