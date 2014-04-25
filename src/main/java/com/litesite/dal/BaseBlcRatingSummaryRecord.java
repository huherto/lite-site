package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcRatingSummaryRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcRatingSummaryRecord extends BaseRecord {
    
    @Column(name="RATING_SUMMARY_ID", sqlType=java.sql.Types.BIGINT)
    public long ratingSummaryId;
    
    @Column(name="AVERAGE_RATING", sqlType=java.sql.Types.DOUBLE)
    public double averageRating;
    
    @Column(name="ITEM_ID", sqlType=java.sql.Types.VARCHAR)
    public String itemId;
    
    @Column(name="RATING_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String ratingType;
}
