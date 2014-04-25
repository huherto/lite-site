package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSandboxActionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSandboxActionTable extends BaseTable<BlcSandboxActionRecord> {

    private RowMapper<BlcSandboxActionRecord> rm = RecordMapper.newInstance(BlcSandboxActionRecord.class);

    public BaseBlcSandboxActionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSandboxActionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SANDBOX_ACTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSandboxActionRecord.class;
    }
}
