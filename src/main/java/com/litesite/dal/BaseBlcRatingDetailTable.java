package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcRatingDetailTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcRatingDetailTable extends BaseTable<BlcRatingDetailRecord> {

    private RowMapper<BlcRatingDetailRecord> rm = RecordMapper.newInstance(BlcRatingDetailRecord.class);

    public BaseBlcRatingDetailTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcRatingDetailRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_RATING_DETAIL";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcRatingDetailRecord.class;
    }
}
