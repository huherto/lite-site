package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcEmailTrackingOpensTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcEmailTrackingOpensTable extends BaseTable<BlcEmailTrackingOpensRecord> {

    private RowMapper<BlcEmailTrackingOpensRecord> rm = RecordMapper.newInstance(BlcEmailTrackingOpensRecord.class);

    public BaseBlcEmailTrackingOpensTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcEmailTrackingOpensRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_EMAIL_TRACKING_OPENS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcEmailTrackingOpensRecord.class;
    }
}
