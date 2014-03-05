package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcAdminUserPermissionXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserPermissionXrefTable extends BaseTable<BlcAdminUserPermissionXrefRecord> {

    private RowMapper<BlcAdminUserPermissionXrefRecord> rm = RecordMapper.newInstance(BlcAdminUserPermissionXrefRecord.class);

    public BaseBlcAdminUserPermissionXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminUserPermissionXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_USER_PERMISSION_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminUserPermissionXrefRecord.class;
    }
}