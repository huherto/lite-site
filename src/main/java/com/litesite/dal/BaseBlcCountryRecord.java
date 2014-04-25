package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcCountryRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCountryRecord extends BaseRecord {
    
    @Column(name="ABBREVIATION", sqlType=java.sql.Types.VARCHAR)
    public String abbreviation;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
