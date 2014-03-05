package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcAdminModuleRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminModuleRecord extends BaseRecord {
    
    @Column(name="ADMIN_MODULE_ID", sqlType=java.sql.Types.BIGINT)
    public long adminModuleId;
    
    @Column(name="DISPLAY_ORDER", sqlType=java.sql.Types.INTEGER)
    public Integer displayOrder;
    
    @Column(name="ICON", sqlType=java.sql.Types.VARCHAR)
    public String icon;
    
    @Column(name="MODULE_KEY", sqlType=java.sql.Types.VARCHAR)
    public String moduleKey;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
}
