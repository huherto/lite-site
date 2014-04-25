package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminUserRoleXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserRoleXrefTable extends BaseTable<BlcAdminUserRoleXrefRecord> {

    private RowMapper<BlcAdminUserRoleXrefRecord> rm = RecordMapper.newInstance(BlcAdminUserRoleXrefRecord.class);

    public BaseBlcAdminUserRoleXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminUserRoleXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_USER_ROLE_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminUserRoleXrefRecord.class;
    }
}
