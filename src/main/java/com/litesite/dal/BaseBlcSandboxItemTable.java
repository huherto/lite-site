package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
