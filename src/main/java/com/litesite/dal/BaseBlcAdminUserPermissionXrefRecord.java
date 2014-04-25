package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcAdminUserPermissionXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserPermissionXrefRecord extends BaseRecord {
    
    @Column(name="ADMIN_USER_ID", sqlType=java.sql.Types.BIGINT)
    public long adminUserId;
    
    @Column(name="ADMIN_PERMISSION_ID", sqlType=java.sql.Types.BIGINT)
    public long adminPermissionId;
}
