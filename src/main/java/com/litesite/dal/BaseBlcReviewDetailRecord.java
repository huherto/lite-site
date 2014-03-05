package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcReviewDetailRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcReviewDetailRecord extends BaseRecord {
    
    @Column(name="REVIEW_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long reviewDetailId;
    
    @Column(name="HELPFUL_COUNT", sqlType=java.sql.Types.INTEGER)
    public int helpfulCount;
    
    @Column(name="NOT_HELPFUL_COUNT", sqlType=java.sql.Types.INTEGER)
    public int notHelpfulCount;
    
    @Column(name="REVIEW_SUBMITTED_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp reviewSubmittedDate;
    
    @Column(name="REVIEW_STATUS", sqlType=java.sql.Types.VARCHAR)
    public String reviewStatus;
    
    @Column(name="REVIEW_TEXT", sqlType=java.sql.Types.VARCHAR)
    public String reviewText;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="RATING_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public Long ratingDetailId;
    
    @Column(name="RATING_SUMMARY_ID", sqlType=java.sql.Types.BIGINT)
    public long ratingSummaryId;
}
