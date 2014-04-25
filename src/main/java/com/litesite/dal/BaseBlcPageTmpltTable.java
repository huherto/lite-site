package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPageTmpltTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageTmpltTable extends BaseTable<BlcPageTmpltRecord> {

    private RowMapper<BlcPageTmpltRecord> rm = RecordMapper.newInstance(BlcPageTmpltRecord.class);

    public BaseBlcPageTmpltTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageTmpltRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE_TMPLT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageTmpltRecord.class;
    }
}
