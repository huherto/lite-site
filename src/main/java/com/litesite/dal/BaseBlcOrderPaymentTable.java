package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcOrderPaymentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderPaymentTable extends BaseTable<BlcOrderPaymentRecord> {

    private RowMapper<BlcOrderPaymentRecord> rm = RecordMapper.newInstance(BlcOrderPaymentRecord.class);

    public BaseBlcOrderPaymentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderPaymentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_PAYMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderPaymentRecord.class;
    }
}
