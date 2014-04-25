package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcEmailTrackingTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcEmailTrackingTable extends BaseTable<BlcEmailTrackingRecord> {

    private RowMapper<BlcEmailTrackingRecord> rm = RecordMapper.newInstance(BlcEmailTrackingRecord.class);

    public BaseBlcEmailTrackingTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcEmailTrackingRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_EMAIL_TRACKING";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcEmailTrackingRecord.class;
    }
}
