package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderTable extends BaseTable<BlcOrderRecord> {

    private RowMapper<BlcOrderRecord> rm = RecordMapper.newInstance(BlcOrderRecord.class);

    public BaseBlcOrderTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderRecord.class;
    }
}
