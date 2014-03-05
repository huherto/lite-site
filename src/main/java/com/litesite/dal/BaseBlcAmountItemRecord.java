package com.litesite.dal;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.Column;
import java.math.BigDecimal;

/**
 * BaseBlcAmountItemRecord –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAmountItemRecord extends BaseRecord {
    
    @Column(name="AMOUNT_ITEM_ID", sqlType=java.sql.Types.BIGINT)
    public long amountItemId;
    
    @Column(name="DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String description;
    
    @Column(name="QUANTITY", sqlType=java.sql.Types.BIGINT)
    public long quantity;
    
    @Column(name="SHORT_DESCRIPTION", sqlType=java.sql.Types.VARCHAR)
    public String shortDescription;
    
    @Column(name="SYSTEM_ID", sqlType=java.sql.Types.VARCHAR)
    public String systemId;
    
    @Column(name="UNIT_PRICE", sqlType=java.sql.Types.NUMERIC)
    public BigDecimal unitPrice;
    
    @Column(name="PAYMENT_ID", sqlType=java.sql.Types.BIGINT)
    public Long paymentId;
}
