package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcOfferCodeRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferCodeRecord extends BaseRecord {
    
    @Column(name="OFFER_CODE_ID", sqlType=java.sql.Types.BIGINT)
    public long offerCodeId;
    
    @Column(name="MAX_USES", sqlType=java.sql.Types.INTEGER)
    public Integer maxUses;
    
    @Column(name="OFFER_CODE", sqlType=java.sql.Types.VARCHAR)
    public String offerCode;
    
    @Column(name="END_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp endDate;
    
    @Column(name="START_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp startDate;
    
    @Column(name="USES", sqlType=java.sql.Types.INTEGER)
    public Integer uses;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public long offerId;
}
