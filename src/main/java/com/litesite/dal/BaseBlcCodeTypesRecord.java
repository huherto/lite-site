package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCodeTypesRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCodeTypesRecord extends BaseRecord {
    
    @Column(name="CODE_ID", sqlType=java.sql.Types.BIGINT)
    public long codeId;
    
    @Column(name="CODE_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String codeType;
    
    @Column(name="CODE_DESC", sqlType=java.sql.Types.VARCHAR)
    public String codeDesc;
    
    @Column(name="CODE_KEY", sqlType=java.sql.Types.VARCHAR)
    public String codeKey;
    
    @Column(name="MODIFIABLE", sqlType=java.sql.Types.CHAR)
    public String modifiable;
}
