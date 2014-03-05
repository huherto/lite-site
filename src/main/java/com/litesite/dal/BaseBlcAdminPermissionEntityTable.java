package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
