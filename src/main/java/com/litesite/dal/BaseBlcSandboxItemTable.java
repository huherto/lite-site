package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSandboxItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSandboxItemTable extends BaseTable<BlcSandboxItemRecord> {

    private RowMapper<BlcSandboxItemRecord> rm = RecordMapper.newInstance(BlcSandboxItemRecord.class);

    public BaseBlcSandboxItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSandboxItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SANDBOX_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSandboxItemRecord.class;
    }
}
