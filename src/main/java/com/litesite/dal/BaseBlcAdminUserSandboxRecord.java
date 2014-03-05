package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

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
