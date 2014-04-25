package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSkuTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuTable extends BaseTable<BlcSkuRecord> {

    private RowMapper<BlcSkuRecord> rm = RecordMapper.newInstance(BlcSkuRecord.class);

    public BaseBlcSkuTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuRecord.class;
    }
}
