package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcReviewFeedbackRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcReviewFeedbackRecord extends BaseRecord {
    
    @Column(name="REVIEW_FEEDBACK_ID", sqlType=java.sql.Types.BIGINT)
    public long reviewFeedbackId;
    
    @Column(name="IS_HELPFUL", sqlType=java.sql.Types.BOOLEAN)
    public boolean isHelpful;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="REVIEW_DETAIL_ID", sqlType=java.sql.Types.BIGINT)
    public long reviewDetailId;
}
