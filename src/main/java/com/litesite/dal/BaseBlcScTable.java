package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcScTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScTable extends BaseTable<BlcScRecord> {

    private RowMapper<BlcScRecord> rm = RecordMapper.newInstance(BlcScRecord.class);

    public BaseBlcScTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScRecord.class;
    }
}
