package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFieldSearchTypesTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFieldSearchTypesTable extends BaseTable<BlcFieldSearchTypesRecord> {

    private RowMapper<BlcFieldSearchTypesRecord> rm = RecordMapper.newInstance(BlcFieldSearchTypesRecord.class);

    public BaseBlcFieldSearchTypesTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFieldSearchTypesRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FIELD_SEARCH_TYPES";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFieldSearchTypesRecord.class;
    }
}
