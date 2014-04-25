package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminUserSandboxTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserSandboxTable extends BaseTable<BlcAdminUserSandboxRecord> {

    private RowMapper<BlcAdminUserSandboxRecord> rm = RecordMapper.newInstance(BlcAdminUserSandboxRecord.class);

    public BaseBlcAdminUserSandboxTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminUserSandboxRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_USER_SANDBOX";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminUserSandboxRecord.class;
    }
}
