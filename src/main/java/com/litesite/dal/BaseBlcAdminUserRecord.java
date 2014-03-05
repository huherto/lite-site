package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdminUserRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserRecord extends BaseRecord {
    
    @Column(name="ADMIN_USER_ID", sqlType=java.sql.Types.BIGINT)
    public long adminUserId;
    
    @Column(name="ACTIVE_STATUS_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean activeStatusFlag;
    
    @Column(name="EMAIL", sqlType=java.sql.Types.VARCHAR)
    public String email;
    
    @Column(name="LOGIN", sqlType=java.sql.Types.VARCHAR)
    public String login;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="PASSWORD", sqlType=java.sql.Types.VARCHAR)
    public String password;
    
    @Column(name="PHONE_NUMBER", sqlType=java.sql.Types.VARCHAR)
    public String phoneNumber;
}
