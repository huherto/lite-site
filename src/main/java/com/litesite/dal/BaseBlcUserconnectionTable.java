package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcUserconnectionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcUserconnectionTable extends BaseTable<BlcUserconnectionRecord> {

    private RowMapper<BlcUserconnectionRecord> rm = RecordMapper.newInstance(BlcUserconnectionRecord.class);

    public BaseBlcUserconnectionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcUserconnectionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_USERCONNECTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcUserconnectionRecord.class;
    }
}
