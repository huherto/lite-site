package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

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
