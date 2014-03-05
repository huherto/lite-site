package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCountryTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCountryTable extends BaseTable<BlcCountryRecord> {

    private RowMapper<BlcCountryRecord> rm = RecordMapper.newInstance(BlcCountryRecord.class);

    public BaseBlcCountryTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCountryRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_COUNTRY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCountryRecord.class;
    }
}
