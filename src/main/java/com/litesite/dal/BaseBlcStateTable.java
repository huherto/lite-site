package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcStateTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStateTable extends BaseTable<BlcStateRecord> {

    private RowMapper<BlcStateRecord> rm = RecordMapper.newInstance(BlcStateRecord.class);

    public BaseBlcStateTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcStateRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_STATE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcStateRecord.class;
    }
}
