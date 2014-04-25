package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseSandboxItemActionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseSandboxItemActionTable extends BaseTable<SandboxItemActionRecord> {

    private RowMapper<SandboxItemActionRecord> rm = RecordMapper.newInstance(SandboxItemActionRecord.class);

    public BaseSandboxItemActionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<SandboxItemActionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "SANDBOX_ITEM_ACTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return SandboxItemActionRecord.class;
    }
}
