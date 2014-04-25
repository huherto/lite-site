package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcCustomerPasswordTokenRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPasswordTokenRecord extends BaseRecord {
    
    @Column(name="PASSWORD_TOKEN", sqlType=java.sql.Types.VARCHAR)
    public String passwordToken;
    
    @Column(name="CREATE_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp createDate;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="TOKEN_USED_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp tokenUsedDate;
    
    @Column(name="TOKEN_USED_FLAG", sqlType=java.sql.Types.BOOLEAN)
    public boolean tokenUsedFlag;
}
