package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcPageFldMapRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageFldMapRecord extends BaseRecord {
    
    @Column(name="PAGE_ID", sqlType=java.sql.Types.BIGINT)
    public long pageId;
    
    @Column(name="PAGE_FLD_ID", sqlType=java.sql.Types.BIGINT)
    public long pageFldId;
    
    @Column(name="MAP_KEY", sqlType=java.sql.Types.VARCHAR)
    public String mapKey;
}
