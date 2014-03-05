package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
