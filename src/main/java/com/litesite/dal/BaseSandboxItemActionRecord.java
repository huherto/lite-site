package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseSandboxItemActionRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseSandboxItemActionRecord extends BaseRecord {
    
    @Column(name="SANDBOX_ACTION_ID", sqlType=java.sql.Types.BIGINT)
    public long sandboxActionId;
    
    @Column(name="SANDBOX_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long sandboxItemId;
}
