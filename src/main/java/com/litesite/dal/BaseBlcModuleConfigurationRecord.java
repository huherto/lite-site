package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.sql.Timestamp;

/**
 * BaseBlcModuleConfigurationRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcModuleConfigurationRecord extends BaseRecord {
    
    @Column(name="MODULE_CONFIG_ID", sqlType=java.sql.Types.BIGINT)
    public long moduleConfigId;
    
    @Column(name="ACTIVE_END_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeEndDate;
    
    @Column(name="ACTIVE_START_DATE", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp activeStartDate;
    
    @Column(name="ARCHIVED", sqlType=java.sql.Types.CHAR)
    public String archived;
    
    @Column(name="CREATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long createdBy;
    
    @Column(name="DATE_CREATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateCreated;
    
    @Column(name="DATE_UPDATED", sqlType=java.sql.Types.TIMESTAMP)
    public Timestamp dateUpdated;
    
    @Column(name="UPDATED_BY", sqlType=java.sql.Types.BIGINT)
    public Long updatedBy;
    
    @Column(name="CONFIG_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String configType;
    
    @Column(name="IS_DEFAULT", sqlType=java.sql.Types.BOOLEAN)
    public boolean isDefault;
    
    @Column(name="MODULE_NAME", sqlType=java.sql.Types.VARCHAR)
    public String moduleName;
    
    @Column(name="MODULE_PRIORITY", sqlType=java.sql.Types.INTEGER)
    public int modulePriority;
}
