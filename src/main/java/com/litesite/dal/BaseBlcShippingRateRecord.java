package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcShippingRateRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcShippingRateRecord extends BaseRecord {
    
    @Column(name="ID", sqlType=java.sql.Types.BIGINT)
    public long id;
    
    @Column(name="BAND_RESULT_PCT", sqlType=java.sql.Types.INTEGER)
    public int bandResultPct;
    
    @Column(name="BAND_RESULT_QTY", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal bandResultQty;
    
    @Column(name="BAND_UNIT_QTY", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal bandUnitQty;
    
    @Column(name="FEE_BAND", sqlType=java.sql.Types.INTEGER)
    public int feeBand;
    
    @Column(name="FEE_SUB_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String feeSubType;
    
    @Column(name="FEE_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String feeType;
}
