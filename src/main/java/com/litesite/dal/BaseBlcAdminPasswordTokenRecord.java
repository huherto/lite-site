package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcAdminPasswordTokenRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminPasswordTokenRecord extends BaseRecord {
    
    @Column(name="PASSWORD_TOKEN", sqlType=java.sql.Types.VARCHAR)
    public String passwordToken;
    
    @Column(name="ADMIN_USER_ID", sqlType=java.sql.Types.BIGINT)
    public long adminUserId;
    
    @Column(name="CREATE_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp createDate;
    
    @Column(name="TOKEN_USED_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp tokenUsedDate;
    
    @Column(name="TOKEN_USED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean tokenUsedFlag;
}
