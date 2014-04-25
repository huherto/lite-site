package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminSectionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminSectionTable extends BaseTable<BlcAdminSectionRecord> {

    private RowMapper<BlcAdminSectionRecord> rm = RecordMapper.newInstance(BlcAdminSectionRecord.class);

    public BaseBlcAdminSectionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminSectionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_SECTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminSectionRecord.class;
    }
}
