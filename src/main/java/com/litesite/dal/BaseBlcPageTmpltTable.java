package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
