package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

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
