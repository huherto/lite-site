package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPhoneTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPhoneTable extends BaseTable<BlcPhoneRecord> {

    private RowMapper<BlcPhoneRecord> rm = RecordMapper.newInstance(BlcPhoneRecord.class);

    public BaseBlcPhoneTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPhoneRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PHONE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPhoneRecord.class;
    }
}
