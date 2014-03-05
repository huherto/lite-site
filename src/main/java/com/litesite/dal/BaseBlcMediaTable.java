package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcMediaTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcMediaTable extends BaseTable<BlcMediaRecord> {

    private RowMapper<BlcMediaRecord> rm = RecordMapper.newInstance(BlcMediaRecord.class);

    public BaseBlcMediaTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcMediaRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_MEDIA";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcMediaRecord.class;
    }
}
