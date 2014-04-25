package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcEmailTrackingClicksRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcEmailTrackingClicksRecord extends BaseRecord {
    
    @Column(name="CLICK_ID", sqlType=java.sql.Types.BIGINT)
    public long clickId;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.VARCHAR)
    public String customerId;
    
    @Column(name="DATE_CLICKED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateClicked;
    
    @Column(name="DESTINATION_URI", sqlType=java.sql.Types.VARCHAR)
    public String destinationUri;
    
    @Column(name="QUERY_STRING", sqlType=java.sql.Types.VARCHAR)
    public String queryString;
    
    @Column(name="EMAIL_TRACKING_ID", sqlType=java.sql.Types.BIGINT)
    public long emailTrackingId;
}
