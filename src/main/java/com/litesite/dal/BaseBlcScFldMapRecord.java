package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcScFldMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldMapRecord extends BaseRecord {
    
    @Column(name="SC_ID", sqlType=java.sql.Types.BIGINT)
    public long scId;
    
    @Column(name="SC_FLD_ID", sqlType=java.sql.Types.BIGINT)
    public long scFldId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
