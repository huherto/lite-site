package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcIdGenerationRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcIdGenerationRecord extends BaseRecord {
    
    @Column(name="ID_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String idType;
    
    @Column(name="BATCH_SIZE", sqlType=java.sql.Types.BIGINT)
    public long batchSize;
    
    @Column(name="BATCH_START", sqlType=java.sql.Types.BIGINT)
    public long batchStart;
    
    @Column(name="ID_MIN", sqlType=java.sql.Types.BIGINT)
    public Long idMin;
    
    @Column(name="ID_MAX", sqlType=java.sql.Types.BIGINT)
    public Long idMax;
    
    @Column(name="VERSION", sqlType=java.sql.Types.INTEGER)
    public Integer version;
}
