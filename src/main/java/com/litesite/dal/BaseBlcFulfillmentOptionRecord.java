package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcFulfillmentOptionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentOptionRecord extends BaseRecord {
    
    @Column(name="FULFILLMENT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long fulfillmentOptionId;
    
    @Column(name="FULFILLMENT_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String fulfillmentType;
    
    @Column(name="LONG_DESCRIPTION", sqlType=java.sql.Types.CLOB)
    public Clob longDescription;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="TAX_CODE", sqlType=java.sql.Types.VARCHAR)
    public String taxCode;
    
    @Column(name="TAXABLE", sqlType=java.sql.Types.BOOLEAN)
    public boolean taxable;
    
    @Column(name="USE_FLAT_RATES", sqlType=java.sql.Types.BOOLEAN)
    public boolean useFlatRates;
}
