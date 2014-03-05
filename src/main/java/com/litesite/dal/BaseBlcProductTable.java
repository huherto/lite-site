package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcProductTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductTable extends BaseTable<BlcProductRecord> {

    private RowMapper<BlcProductRecord> rm = RecordMapper.newInstance(BlcProductRecord.class);

    public BaseBlcProductTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductRecord.class;
    }
}
