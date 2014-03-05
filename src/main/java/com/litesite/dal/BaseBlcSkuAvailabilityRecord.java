package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcSkuAvailabilityRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuAvailabilityRecord extends BaseRecord {
    
    @Column(name="SKU_AVAILABILITY_ID", sqlType=java.sql.Types.BIGINT)
    public long skuAvailabilityId;
    
    @Column(name="AVAILABILITY_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp availabilityDate;
    
    @Column(name="AVAILABILITY_STATUS", sqlType=java.sql.Types.VARCHAR)
    public String availabilityStatus;
    
    @Column(name="LOCATION_ID", sqlType=java.sql.Types.BIGINT)
    public Long locationId;
    
    @Column(name="QTY_ON_HAND", sqlType=java.sql.Types.INTEGER)
    public Integer qtyOnHand;
    
    @Column(name="RESERVE_QTY", sqlType=java.sql.Types.INTEGER)
    public Integer reserveQty;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public Long skuId;
}
