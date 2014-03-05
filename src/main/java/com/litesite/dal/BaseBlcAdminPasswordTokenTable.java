package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcAdminPasswordTokenTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminPasswordTokenTable extends BaseTable<BlcAdminPasswordTokenRecord> {

    private RowMapper<BlcAdminPasswordTokenRecord> rm = RecordMapper.newInstance(BlcAdminPasswordTokenRecord.class);

    public BaseBlcAdminPasswordTokenTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminPasswordTokenRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_PASSWORD_TOKEN";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminPasswordTokenRecord.class;
    }
}
