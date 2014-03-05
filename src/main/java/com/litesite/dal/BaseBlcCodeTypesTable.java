package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCodeTypesTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCodeTypesTable extends BaseTable<BlcCodeTypesRecord> {

    private RowMapper<BlcCodeTypesRecord> rm = RecordMapper.newInstance(BlcCodeTypesRecord.class);

    public BaseBlcCodeTypesTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCodeTypesRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CODE_TYPES";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCodeTypesRecord.class;
    }
}
