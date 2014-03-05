package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcStoreTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStoreTable extends BaseTable<BlcStoreRecord> {

    private RowMapper<BlcStoreRecord> rm = RecordMapper.newInstance(BlcStoreRecord.class);

    public BaseBlcStoreTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcStoreRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_STORE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcStoreRecord.class;
    }
}
