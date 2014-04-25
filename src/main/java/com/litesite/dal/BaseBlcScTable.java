package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcScTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScTable extends BaseTable<BlcScRecord> {

    private RowMapper<BlcScRecord> rm = RecordMapper.newInstance(BlcScRecord.class);

    public BaseBlcScTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScRecord.class;
    }
}
