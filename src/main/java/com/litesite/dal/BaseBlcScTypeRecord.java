package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcScTypeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScTypeRecord extends BaseRecord {
    
    @Column(name="SC_TYPE_ID", sqlType=java.sql.Types.BIGINT)
    public long scTypeId;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SC_FLD_TMPLT_ID", sqlType=java.sql.Types.BIGINT)
    public Long scFldTmpltId;
}
