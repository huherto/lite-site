package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcTranslationRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcTranslationRecord extends BaseRecord {
    
    @Column(name="TRANSLATION_ID", sqlType=java.sql.Types.BIGINT)
    public long translationId;
    
    @Column(name="ENTITY_ID", sqlType=java.sql.Types.VARCHAR)
    public String entityId;
    
    @Column(name="ENTITY_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String entityType;
    
    @Column(name="FIELD_NAME", sqlType=java.sql.Types.VARCHAR)
    public String fieldName;
    
    @Column(name="LOCALE_CODE", sqlType=java.sql.Types.VARCHAR)
    public String localeCode;
    
    @Column(name="TRANSLATED_VALUE", sqlType=java.sql.Types.CLOB)
    public Clob translatedValue;
}
