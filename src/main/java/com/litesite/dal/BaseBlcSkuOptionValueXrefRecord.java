package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcSkuOptionValueXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuOptionValueXrefRecord extends BaseRecord {
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
    
    @Column(name="PRODUCT_OPTION_VALUE_ID", sqlType=java.sql.Types.BIGINT)
    public long productOptionValueId;
}
