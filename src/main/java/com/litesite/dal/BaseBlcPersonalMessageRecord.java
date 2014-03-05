package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcPersonalMessageRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPersonalMessageRecord extends BaseRecord {
    
    @Column(name="PERSONAL_MESSAGE_ID", sqlType=java.sql.Types.BIGINT)
    public long personalMessageId;
    
    @Column(name="MESSAGE", sqlType=java.sql.Types.VARCHAR)
    public String message;
    
    @Column(name="MESSAGE_FROM", sqlType=java.sql.Types.VARCHAR)
    public String messageFrom;
    
    @Column(name="MESSAGE_TO", sqlType=java.sql.Types.VARCHAR)
    public String messageTo;
    
    @Column(name="OCCASION", sqlType=java.sql.Types.VARCHAR)
    public String occasion;
}
