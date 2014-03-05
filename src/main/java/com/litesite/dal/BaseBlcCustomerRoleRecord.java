package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcCustomerRoleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerRoleRecord extends BaseRecord {
    
    @Column(name="CUSTOMER_ROLE_ID", sqlType=java.sql.Types.BIGINT)
    public long customerRoleId;
    
    @Column(name="CUSTOMER_ID", sqlType=java.sql.Types.BIGINT)
    public long customerId;
    
    @Column(name="ROLE_ID", sqlType=java.sql.Types.BIGINT)
    public long roleId;
}
