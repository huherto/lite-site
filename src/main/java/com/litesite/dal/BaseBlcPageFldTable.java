package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPageFldTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageFldTable extends BaseTable<BlcPageFldRecord> {

    private RowMapper<BlcPageFldRecord> rm = RecordMapper.newInstance(BlcPageFldRecord.class);

    public BaseBlcPageFldTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageFldRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE_FLD";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageFldRecord.class;
    }
}
