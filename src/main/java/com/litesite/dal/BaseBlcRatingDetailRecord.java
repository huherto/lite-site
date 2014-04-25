package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcRatingDetailRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcRatingDetailRecord extends BaseRecord {
    
    @Column(name="RATING_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long ratingDetailId;
    
    @Column(name="RATING", sqlType=java.sql.Types.DOUBLE)
    public double rating;
    
    @Column(name="RATING_SUBMITTED_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp ratingSubmittedDate;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="RATING_SUMMARY_ID", sqlType=java.sql.Types.BIGINT)
    public long ratingSummaryId;
}
