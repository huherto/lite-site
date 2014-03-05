package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCurrencyTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCurrencyTable extends BaseTable<BlcCurrencyRecord> {

    private RowMapper<BlcCurrencyRecord> rm = RecordMapper.newInstance(BlcCurrencyRecord.class);

    public BaseBlcCurrencyTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCurrencyRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CURRENCY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCurrencyRecord.class;
    }
}
