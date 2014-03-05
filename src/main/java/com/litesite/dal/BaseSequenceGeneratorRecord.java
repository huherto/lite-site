package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseSequenceGeneratorRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseSequenceGeneratorRecord extends BaseRecord {
    
    @Column(name="ID_NAME", sqlType=java.sql.Types.VARCHAR)
    public String idName;
    
    @Column(name="ID_VAL", sqlType=java.sql.Types.BIGINT)
    public Long idVal;
}
