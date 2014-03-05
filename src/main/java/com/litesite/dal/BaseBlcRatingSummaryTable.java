package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
