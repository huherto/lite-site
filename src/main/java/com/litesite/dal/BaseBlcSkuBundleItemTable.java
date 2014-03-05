package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
