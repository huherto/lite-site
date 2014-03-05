package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcFldEnumItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldEnumItemRecord extends BaseRecord {
    
    @Column(name="FLD_ENUM_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long fldEnumItemId;
    
    @Column(name="FLD_ORDER", sqlType=java.sql.Types.INTEGER)
    public Integer fldOrder;
    
    @Column(name="FRIENDLY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String friendlyName;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="FLD_ENUM_ID", sqlType=java.sql.Types.BIGINT)
    public Long fldEnumId;
}
