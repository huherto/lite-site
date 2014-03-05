package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;
import java.sql.Timestamp;

/**
 * BaseBlcPageFldRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageFldRecord extends BaseRecord {
    
    @Column(name="PAGE_FLD_ID", sqlType=java.sql.Types.BIGINT)
    public long pageFldId;
    
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
    
    @Column(name="PAGE_ID", sqlType=java.sql.Types.BIGINT)
    public Long pageId;
}
