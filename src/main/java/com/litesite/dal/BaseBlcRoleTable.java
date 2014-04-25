package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcRoleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcRoleTable extends BaseTable<BlcRoleRecord> {

    private RowMapper<BlcRoleRecord> rm = RecordMapper.newInstance(BlcRoleRecord.class);

    public BaseBlcRoleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcRoleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ROLE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcRoleRecord.class;
    }
}
