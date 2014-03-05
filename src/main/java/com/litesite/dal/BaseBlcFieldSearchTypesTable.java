package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
