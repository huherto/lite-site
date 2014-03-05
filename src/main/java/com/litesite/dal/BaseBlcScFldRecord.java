package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;
import java.sql.Timestamp;

/**
 * BaseBlcScFldRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldRecord extends BaseRecord {
    
    @Column(name="SC_FLD_ID", sqlType=java.sql.Types.BIGINT)
    public long scFldId;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="FLD_KEY", sqlType=java.sql.Types.VARCHAR)
    public String fldKey;
    
    @Column(name="LOB_VALUE", sqlType=java.sql.Types.CLOB)
    public Clob lobValue;
    
    @Column(name="VALUE", sqlType=java.sql.Types.VARCHAR)
    public String value;
    
    @Column(name="SC_ID", sqlType=java.sql.Types.BIGINT)
    public Long scId;
}
