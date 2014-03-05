package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcReviewFeedbackTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcReviewFeedbackTable extends BaseTable<BlcReviewFeedbackRecord> {

    private RowMapper<BlcReviewFeedbackRecord> rm = RecordMapper.newInstance(BlcReviewFeedbackRecord.class);

    public BaseBlcReviewFeedbackTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcReviewFeedbackRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_REVIEW_FEEDBACK";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcReviewFeedbackRecord.class;
    }
}
