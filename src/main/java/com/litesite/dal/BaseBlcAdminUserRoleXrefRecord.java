package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcAdminUserRoleXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserRoleXrefRecord extends BaseRecord {
    
    @Column(name="ADMIN_USER_ID", sqlType=java.sql.Types.BIGINT)
    public long adminUserId;
    
    @Column(name="ADMIN_ROLE_ID", sqlType=java.sql.Types.BIGINT)
    public long adminRoleId;
}
