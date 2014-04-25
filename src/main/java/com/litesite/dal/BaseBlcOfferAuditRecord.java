package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcOfferAuditRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferAuditRecord extends BaseRecord {
    
    @Column(name="OFFER_AUDIT_ID", sqlType=java.sql.Types.BIGINT)
    public long offerAuditId;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public Long customerId;
    
    @Column(name="OFFER_ID", sqlType=java.sql.Types.BIGINT)
    public Long offerId;
    
    @Column(name="ORDER_ID", sqlType=java.sql.Types.BIGINT)
    public Long orderId;
    
    @Column(name="REDEEMED_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp redeemedDate;
}
