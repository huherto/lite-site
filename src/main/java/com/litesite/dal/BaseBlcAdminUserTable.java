package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminUserTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminUserTable extends BaseTable<BlcAdminUserRecord> {

    private RowMapper<BlcAdminUserRecord> rm = RecordMapper.newInstance(BlcAdminUserRecord.class);

    public BaseBlcAdminUserTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminUserRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_USER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminUserRecord.class;
    }
}
