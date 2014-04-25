package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcRoleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcRoleRecord extends BaseRecord {
    
    @Column(name="ROLE_ID", sqlType=java.sql.Types.BIGINT)
    public long roleId;
    
    @Column(name="ROLE_NAME", sqlType=java.sql.Types.VARCHAR)
    public String roleName;
}
