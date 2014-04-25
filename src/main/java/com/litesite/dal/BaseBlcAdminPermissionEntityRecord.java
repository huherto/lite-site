package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcAdminPermissionEntityRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminPermissionEntityRecord extends BaseRecord {
    
    @Column(name="ADMIN_PERMISSION_ENTITY_ID", sqlType=java.sql.Types.BIGINT)
    public long adminPermissionEntityId;
    
    @Column(name="CEILING_ENTITY", sqlType=java.sql.Types.VARCHAR)
    public String ceilingEntity;
    
    @Column(name="ADMIN_PERMISSION_ID", sqlType=java.sql.Types.BIGINT)
    public Long adminPermissionId;
}
