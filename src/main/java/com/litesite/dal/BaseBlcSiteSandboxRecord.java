package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcSiteSandboxRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSiteSandboxRecord extends BaseRecord {
    
    @Column(name="SITE_ID", sqlType=java.sql.Types.BIGINT)
    public Long siteId;
    
    @Column(name="SANDBOX_ID", sqlType=java.sql.Types.BIGINT)
    public long sandboxId;
}
