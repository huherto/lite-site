package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPaymentResponseItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPaymentResponseItemTable extends BaseTable<BlcPaymentResponseItemRecord> {

    private RowMapper<BlcPaymentResponseItemRecord> rm = RecordMapper.newInstance(BlcPaymentResponseItemRecord.class);

    public BaseBlcPaymentResponseItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPaymentResponseItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAYMENT_RESPONSE_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPaymentResponseItemRecord.class;
    }
}
