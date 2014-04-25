package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcEmailTrackingClicksTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcEmailTrackingClicksTable extends BaseTable<BlcEmailTrackingClicksRecord> {

    private RowMapper<BlcEmailTrackingClicksRecord> rm = RecordMapper.newInstance(BlcEmailTrackingClicksRecord.class);

    public BaseBlcEmailTrackingClicksTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcEmailTrackingClicksRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_EMAIL_TRACKING_CLICKS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcEmailTrackingClicksRecord.class;
    }
}
