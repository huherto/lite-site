package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcScTypeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScTypeTable extends BaseTable<BlcScTypeRecord> {

    private RowMapper<BlcScTypeRecord> rm = RecordMapper.newInstance(BlcScTypeRecord.class);

    public BaseBlcScTypeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScTypeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_TYPE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScTypeRecord.class;
    }
}
