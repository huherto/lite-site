package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdminRolePermissionXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminRolePermissionXrefRecord extends BaseRecord {
    
    @Column(name="ADMIN_ROLE_ID", sqlType=java.sql.Types.BIGINT)
    public long adminRoleId;
    
    @Column(name="ADMIN_PERMISSION_ID", sqlType=java.sql.Types.BIGINT)
    public long adminPermissionId;
}
