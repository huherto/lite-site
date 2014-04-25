package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcProductBundleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductBundleTable extends BaseTable<BlcProductBundleRecord> {

    private RowMapper<BlcProductBundleRecord> rm = RecordMapper.newInstance(BlcProductBundleRecord.class);

    public BaseBlcProductBundleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductBundleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_BUNDLE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductBundleRecord.class;
    }
}
