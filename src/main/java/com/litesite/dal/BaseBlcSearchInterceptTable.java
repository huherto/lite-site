package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSearchInterceptTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchInterceptTable extends BaseTable<BlcSearchInterceptRecord> {

    private RowMapper<BlcSearchInterceptRecord> rm = RecordMapper.newInstance(BlcSearchInterceptRecord.class);

    public BaseBlcSearchInterceptTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSearchInterceptRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SEARCH_INTERCEPT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSearchInterceptRecord.class;
    }
}
