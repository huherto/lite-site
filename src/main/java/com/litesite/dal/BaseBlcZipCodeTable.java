package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcZipCodeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcZipCodeTable extends BaseTable<BlcZipCodeRecord> {

    private RowMapper<BlcZipCodeRecord> rm = RecordMapper.newInstance(BlcZipCodeRecord.class);

    public BaseBlcZipCodeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcZipCodeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ZIP_CODE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcZipCodeRecord.class;
    }
}
