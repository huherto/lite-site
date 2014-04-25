package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcScFldgrpXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldgrpXrefRecord extends BaseRecord {
    
    @Column(name="SC_FLD_TMPLT_ID", sqlType=java.sql.Types.BIGINT)
    public long scFldTmpltId;
    
    @Column(name="FLD_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fldGroupId;
    
    @Column(name="GROUP_ORDER", sqlType=java.sql.Types.INTEGER)
    public int groupOrder;
}
