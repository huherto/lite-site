package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcChallengeQuestionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcChallengeQuestionRecord extends BaseRecord {
    
    @Column(name="QUESTION_ID", sqlType=java.sql.Types.BIGINT)
    public long questionId;
    
    @Column(name="QUESTION", sqlType=java.sql.Types.VARCHAR)
    public String question;
}
