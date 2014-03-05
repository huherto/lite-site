package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
