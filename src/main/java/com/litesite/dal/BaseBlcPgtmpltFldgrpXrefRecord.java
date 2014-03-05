package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcPgtmpltFldgrpXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPgtmpltFldgrpXrefRecord extends BaseRecord {
    
    @Column(name="PAGE_TMPLT_ID", sqlType=java.sql.Types.BIGINT)
    public long pageTmpltId;
    
    @Column(name="FLD_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public long fldGroupId;
    
    @Column(name="GROUP_ORDER", sqlType=java.sql.Types.INTEGER)
    public int groupOrder;
}
