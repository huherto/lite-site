package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcEmailTrackingRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcEmailTrackingRecord extends BaseRecord {
    
    @Column(name="EMAIL_TRACKING_ID", sqlType=java.sql.Types.BIGINT)
    public long emailTrackingId;
    
    @Column(name="DATE_SENT", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateSent;
    
    @Column(name="EMAIL_ADDRESS", sqlType=java.sql.Types.VARCHAR)
    public String emailAddress;
    
    @Column(name="TYPE", sqlType=java.sql.Types.VARCHAR)
    public String type;
}
