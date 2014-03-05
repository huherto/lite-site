package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPageTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageTable extends BaseTable<BlcPageRecord> {

    private RowMapper<BlcPageRecord> rm = RecordMapper.newInstance(BlcPageRecord.class);

    public BaseBlcPageTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageRecord.class;
    }
}
