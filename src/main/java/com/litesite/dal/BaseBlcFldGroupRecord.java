package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcFldGroupRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldGroupRecord extends BaseRecord {
    
    @Column(name="FLD_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fldGroupId;
    
    @Column(name="INIT_COLLAPSED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean initCollapsedFlag;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
