package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcEmailTrackingOpensRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcEmailTrackingOpensRecord extends BaseRecord {
    
    @Column(name="OPEN_ID", sqlType=java.sql.Types.BIGINT)
    public long openId;
    
    @Column(name="DATE_OPENED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateOpened;
    
    @Column(name="USER_AGENT", sqlType=java.sql.Types.VARCHAR)
    public String userAgent;
    
    @Column(name="EMAIL_TRACKING_ID", sqlType=java.sql.Types.BIGINT)
    public Long emailTrackingId;
}
