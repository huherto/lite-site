package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcBundleOrderItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcBundleOrderItemTable extends BaseTable<BlcBundleOrderItemRecord> {

    private RowMapper<BlcBundleOrderItemRecord> rm = RecordMapper.newInstance(BlcBundleOrderItemRecord.class);

    public BaseBlcBundleOrderItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcBundleOrderItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_BUNDLE_ORDER_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcBundleOrderItemRecord.class;
    }
}
