package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSandboxTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSandboxTable extends BaseTable<BlcSandboxRecord> {

    private RowMapper<BlcSandboxRecord> rm = RecordMapper.newInstance(BlcSandboxRecord.class);

    public BaseBlcSandboxTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSandboxRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SANDBOX";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSandboxRecord.class;
    }
}
