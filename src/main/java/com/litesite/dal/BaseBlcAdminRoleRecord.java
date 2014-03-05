package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdminRoleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminRoleRecord extends BaseRecord {
    
    @Column(name="ADMIN_ROLE_ID", sqlType=java.sql.Types.BIGINT)
    public long adminRoleId;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
