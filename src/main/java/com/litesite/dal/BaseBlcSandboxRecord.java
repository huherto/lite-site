package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSandboxRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSandboxRecord extends BaseRecord {
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public long sandboxId;
    
    @Column(name="AUTHOR", sqlType=java.sql.Types.BIGINT)
    public Long author;
    
    @Column(name="SANDBOX_NAME", sqlType=java.sql.Types.VARCHAR)
    public String sandboxName;
    
    @Column(name="SANDBOX_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String sandboxType;
}
