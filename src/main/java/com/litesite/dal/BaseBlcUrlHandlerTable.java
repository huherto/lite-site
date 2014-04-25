package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcUrlHandlerTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcUrlHandlerTable extends BaseTable<BlcUrlHandlerRecord> {

    private RowMapper<BlcUrlHandlerRecord> rm = RecordMapper.newInstance(BlcUrlHandlerRecord.class);

    public BaseBlcUrlHandlerTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcUrlHandlerRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_URL_HANDLER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcUrlHandlerRecord.class;
    }
}
