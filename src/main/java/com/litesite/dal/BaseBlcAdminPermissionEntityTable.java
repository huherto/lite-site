package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminPermissionEntityTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminPermissionEntityTable extends BaseTable<BlcAdminPermissionEntityRecord> {

    private RowMapper<BlcAdminPermissionEntityRecord> rm = RecordMapper.newInstance(BlcAdminPermissionEntityRecord.class);

    public BaseBlcAdminPermissionEntityTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminPermissionEntityRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_PERMISSION_ENTITY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminPermissionEntityRecord.class;
    }
}
