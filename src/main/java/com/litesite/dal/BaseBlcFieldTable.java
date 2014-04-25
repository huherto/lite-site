package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFieldTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFieldTable extends BaseTable<BlcFieldRecord> {

    private RowMapper<BlcFieldRecord> rm = RecordMapper.newInstance(BlcFieldRecord.class);

    public BaseBlcFieldTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFieldRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FIELD";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFieldRecord.class;
    }
}
