package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcScRuleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScRuleRecord extends BaseRecord {
    
    @Column(name="SC_RULE_ID", sqlType=java.sql.Types.BIGINT)
    public long scRuleId;
    
    @Column(name="MATCH_RULE", sqlType=java.sql.Types.CLOB)
    public Clob matchRule;
}
