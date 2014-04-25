package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

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
