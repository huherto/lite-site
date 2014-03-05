package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
