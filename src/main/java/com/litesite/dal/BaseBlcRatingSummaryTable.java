package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcRatingSummaryTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcRatingSummaryTable extends BaseTable<BlcRatingSummaryRecord> {

    private RowMapper<BlcRatingSummaryRecord> rm = RecordMapper.newInstance(BlcRatingSummaryRecord.class);

    public BaseBlcRatingSummaryTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcRatingSummaryRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_RATING_SUMMARY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcRatingSummaryRecord.class;
    }
}
