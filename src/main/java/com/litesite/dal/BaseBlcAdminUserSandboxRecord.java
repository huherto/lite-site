package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcAdminUserSandboxRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserSandboxRecord extends BaseRecord {
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long sandboxId;
    
    @Column(name="ADMIN_USER_ID", sqlType=java.sql.Types.BIGINT)
    public long adminUserId;
}
