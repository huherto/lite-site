package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

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
