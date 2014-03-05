package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Clob;

/**
 * BaseBlcPageRuleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageRuleRecord extends BaseRecord {
    
    @Column(name="PAGE_RULE_ID", sqlType=java.sql.Types.BIGINT)
    public long pageRuleId;
    
    @Column(name="MATCH_RULE", sqlType=java.sql.Types.CLOB)
    public Clob matchRule;
}
