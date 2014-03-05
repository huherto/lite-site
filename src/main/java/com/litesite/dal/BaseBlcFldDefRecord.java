package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcFldDefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldDefRecord extends BaseRecord {
    
    @Column(name="FLD_DEF_ID", sqlType=java.sql.Types.BIGINT)
    public long fldDefId;
    
    @Column(name="ALLOW_MULTIPLES", sqlType=java.sql.Types.BOOLEAN)
    public boolean allowMultiples;
    
    @Column(name="COLUMN_WIDTH", sqlType=java.sql.Types.VARCHAR)
    public String columnWidth;
    
    @Column(name="FLD_ORDER", sqlType=java.sql.Types.INTEGER)
    public Integer fldOrder;
    
    @Column(name="FLD_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String fldType;
    
    @Column(name="FRIENDLY_NAME", sqlType=java.sql.Types.VARCHAR)
    public String friendlyName;
    
    @Column(name="HIDDEN_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean hiddenFlag;
    
    @Column(name="MAX_LENGTH", sqlType=java.sql.Types.INTEGER)
    public Integer maxLength;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SECURITY_LEVEL", sqlType=java.sql.Types.VARCHAR)
    public String securityLevel;
    
    @Column(name="TEXT_AREA_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean textAreaFlag;
    
    @Column(name="VLDTN_ERROR_MSSG_KEY", sqlType=java.sql.Types.VARCHAR)
    public String vldtnErrorMssgKey;
    
    @Column(name="VLDTN_REGEX", sqlType=java.sql.Types.VARCHAR)
    public String vldtnRegex;
    
    @Column(name="FLD_ENUM_ID", sqlType=java.sql.Types.BIGINT)
    public Long fldEnumId;
    
    @Column(name="FLD_GROUP_ID", sqlType=java.sql.Types.BIGINT)
    public Long fldGroupId;
}
