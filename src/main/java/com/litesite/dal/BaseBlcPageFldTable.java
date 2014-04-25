package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

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
