package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcPageRuleMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageRuleMapRecord extends BaseRecord {
    
    @Column(name="BLC_PAGE_PAGE_ID", sqlType=java.sql.Types.BIGINT)
    public long blcPagePageId;
    
    @Column(name="PAGE_RULE_ID", sqlType=java.sql.Types.BIGINT)
    public long pageRuleId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
