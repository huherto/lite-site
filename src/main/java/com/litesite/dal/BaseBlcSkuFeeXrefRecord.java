package com.litesite.dal;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.Column;

/**
 * BaseBlcSkuFeeXrefRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFeeXrefRecord extends BaseRecord {
    
    @Column(name="SKU_FEE_ID", sqlType=java.sql.Types.BIGINT)
    public long skuFeeId;
    
    @Column(name="SKU_ID", sqlType=java.sql.Types.BIGINT)
    public long skuId;
}
