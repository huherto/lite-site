package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcAdminSectionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminSectionRecord extends BaseRecord {
    
    @Column(name="ADMIN_SECTION_ID", sqlType=java.sql.Types.BIGINT)
    public long adminSectionId;
    
    @Column(name="CEILING_ENTITY", sqlType=java.sql.Types.VARCHAR)
    public String ceilingEntity;
    
    @Column(name="DISPLAY_CONTROLLER", sqlType=java.sql.Types.VARCHAR)
    public String displayController;
    
    @Column(name="DISPLAY_ORDER", sqlType=java.sql.Types.INTEGER)
    public Integer displayOrder;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SECTION_KEY", sqlType=java.sql.Types.VARCHAR)
    public String sectionKey;
    
    @Column(name="URL", sqlType=java.sql.Types.VARCHAR)
    public String url;
    
    @Column(name="USE_DEFAULT_HANDLER", sqlType=java.sql.Types.BOOLEAN)
    public boolean useDefaultHandler;
    
    @Column(name="ADMIN_MODULE_ID", sqlType=java.sql.Types.BIGINT)
    public long adminModuleId;
}
