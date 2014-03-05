package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcSiteRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSiteRecord extends BaseRecord {
    
    @Column(name="SITE_ID", sqlType=java.sql.Types.BIGINT)
    public long siteId;
    
    @Column(name="ARCHIVED", sqlType=java.sql.Types.CHAR)
    public String archived;
    
    @Column(name="DEACTIVATED", sqlType=java.sql.Types.BOOLEAN)
    public boolean deactivated;
    
    @Column(name="NAME", sqlType=java.sql.Types.VARCHAR)
    public String name;
    
    @Column(name="SITE_IDENTIFIER_TYPE", sqlType=java.sql.Types.VARCHAR)
    public String siteIdentifierType;
    
    @Column(name="SITE_IDENTIFIER_VALUE", sqlType=java.sql.Types.VARCHAR)
    public String siteIdentifierValue;
    
    @Column(name="PRODUCTION_SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public Long productionSandboxId;
}
