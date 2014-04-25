package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSkuBundleItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuBundleItemTable extends BaseTable<BlcSkuBundleItemRecord> {

    private RowMapper<BlcSkuBundleItemRecord> rm = RecordMapper.newInstance(BlcSkuBundleItemRecord.class);

    public BaseBlcSkuBundleItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuBundleItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_BUNDLE_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuBundleItemRecord.class;
    }
}
