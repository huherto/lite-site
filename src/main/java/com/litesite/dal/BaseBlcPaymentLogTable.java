package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPaymentLogTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPaymentLogTable extends BaseTable<BlcPaymentLogRecord> {

    private RowMapper<BlcPaymentLogRecord> rm = RecordMapper.newInstance(BlcPaymentLogRecord.class);

    public BaseBlcPaymentLogTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPaymentLogRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAYMENT_LOG";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPaymentLogRecord.class;
    }
}
