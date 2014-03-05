package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
