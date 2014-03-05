package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcProductOptionXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductOptionXrefRecord extends BaseRecord {
    
    @Column(name="PRODUCT_OPTION_ID", sqlType=java.sql.Types.BIGINT)
    public long productOptionId;
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public long productId;
}
