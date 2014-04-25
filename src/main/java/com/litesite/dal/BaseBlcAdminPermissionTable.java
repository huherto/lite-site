package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminPermissionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminPermissionTable extends BaseTable<BlcAdminPermissionRecord> {

    private RowMapper<BlcAdminPermissionRecord> rm = RecordMapper.newInstance(BlcAdminPermissionRecord.class);

    public BaseBlcAdminPermissionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminPermissionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_PERMISSION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminPermissionRecord.class;
    }
}
