package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminModuleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminModuleTable extends BaseTable<BlcAdminModuleRecord> {

    private RowMapper<BlcAdminModuleRecord> rm = RecordMapper.newInstance(BlcAdminModuleRecord.class);

    public BaseBlcAdminModuleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminModuleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_MODULE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminModuleRecord.class;
    }
}
