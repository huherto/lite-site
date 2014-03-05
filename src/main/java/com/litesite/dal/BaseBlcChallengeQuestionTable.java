package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcChallengeQuestionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcChallengeQuestionTable extends BaseTable<BlcChallengeQuestionRecord> {

    private RowMapper<BlcChallengeQuestionRecord> rm = RecordMapper.newInstance(BlcChallengeQuestionRecord.class);

    public BaseBlcChallengeQuestionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcChallengeQuestionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CHALLENGE_QUESTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcChallengeQuestionRecord.class;
    }
}
