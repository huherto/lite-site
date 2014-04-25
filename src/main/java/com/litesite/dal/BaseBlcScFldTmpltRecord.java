package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcScFldTmpltRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldTmpltRecord extends BaseRecord {
    
    @Column(name="SC_FLD_TMPLT_ID", sqlType=java.sql.Types.BIGINT)
    public long scFldTmpltId;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
