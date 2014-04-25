package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSystemPropertyTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSystemPropertyTable extends BaseTable<BlcSystemPropertyRecord> {

    private RowMapper<BlcSystemPropertyRecord> rm = RecordMapper.newInstance(BlcSystemPropertyRecord.class);

    public BaseBlcSystemPropertyTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSystemPropertyRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SYSTEM_PROPERTY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSystemPropertyRecord.class;
    }
}
