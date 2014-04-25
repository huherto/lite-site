package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminRoleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminRoleTable extends BaseTable<BlcAdminRoleRecord> {

    private RowMapper<BlcAdminRoleRecord> rm = RecordMapper.newInstance(BlcAdminRoleRecord.class);

    public BaseBlcAdminRoleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminRoleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_ROLE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminRoleRecord.class;
    }
}
