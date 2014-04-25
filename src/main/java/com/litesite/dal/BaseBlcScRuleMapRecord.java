package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcScRuleMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScRuleMapRecord extends BaseRecord {
    
    @Column(name="BLC_SC_SC_ID", sqlType=java.sql.Types.BIGINT)
    public long blcScScId;
    
    @Column(name="SC_RULE_ID", sqlType=java.sql.Types.BIGINT)
    public long scRuleId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
