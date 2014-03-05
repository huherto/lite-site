package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;

/**
 * BaseBlcProductSkuXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductSkuXrefRecord extends BaseRecord {
    
    @Column(name="PRODUCT_ID", sqlType=java.sql.Types.BIGINT)
    public Long productId;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
}
