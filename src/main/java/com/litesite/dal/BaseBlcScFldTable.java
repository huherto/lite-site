package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcScFldTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldTable extends BaseTable<BlcScFldRecord> {

    private RowMapper<BlcScFldRecord> rm = RecordMapper.newInstance(BlcScFldRecord.class);

    public BaseBlcScFldTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScFldRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_FLD";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScFldRecord.class;
    }
}
