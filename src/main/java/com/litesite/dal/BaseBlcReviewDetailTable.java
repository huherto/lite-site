package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcReviewDetailTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcReviewDetailTable extends BaseTable<BlcReviewDetailRecord> {

    private RowMapper<BlcReviewDetailRecord> rm = RecordMapper.newInstance(BlcReviewDetailRecord.class);

    public BaseBlcReviewDetailTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcReviewDetailRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_REVIEW_DETAIL";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcReviewDetailRecord.class;
    }
}
