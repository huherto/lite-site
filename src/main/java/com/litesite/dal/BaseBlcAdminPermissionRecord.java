package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdminPermissionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminPermissionRecord extends BaseRecord {
    
    @Column(name="ADMIN_PERMISSION_ID", sqlType=java.sql.Types.BIGINT)
    public long adminPermissionId;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="PERMISSION_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String permissionType;
}
