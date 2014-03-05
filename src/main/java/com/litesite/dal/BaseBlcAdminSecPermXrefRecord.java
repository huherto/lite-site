package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdminSecPermXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminSecPermXrefRecord extends BaseRecord {
    
    @Column(name="ADMIN_SECTION_ID", sqlType=java.sql.Types.BIGINT)
    public long adminSectionId;
    
    @Column(name="ADMIN_PERMISSION_ID", sqlType=java.sql.Types.BIGINT)
    public long adminPermissionId;
}
