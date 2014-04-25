package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcLocaleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcLocaleTable extends BaseTable<BlcLocaleRecord> {

    private RowMapper<BlcLocaleRecord> rm = RecordMapper.newInstance(BlcLocaleRecord.class);

    public BaseBlcLocaleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcLocaleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_LOCALE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcLocaleRecord.class;
    }
}
