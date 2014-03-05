package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcAdminRolePermissionXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminRolePermissionXrefTable extends BaseTable<BlcAdminRolePermissionXrefRecord> {

    private RowMapper<BlcAdminRolePermissionXrefRecord> rm = RecordMapper.newInstance(BlcAdminRolePermissionXrefRecord.class);

    public BaseBlcAdminRolePermissionXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminRolePermissionXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_ROLE_PERMISSION_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminRolePermissionXrefRecord.class;
    }
}
