package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

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
