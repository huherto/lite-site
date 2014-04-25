package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcGiftCardPaymentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcGiftCardPaymentTable extends BaseTable<BlcGiftCardPaymentRecord> {

    private RowMapper<BlcGiftCardPaymentRecord> rm = RecordMapper.newInstance(BlcGiftCardPaymentRecord.class);

    public BaseBlcGiftCardPaymentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcGiftCardPaymentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_GIFT_CARD_PAYMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcGiftCardPaymentRecord.class;
    }
}
