package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcProductFeaturedTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductFeaturedTable extends BaseTable<BlcProductFeaturedRecord> {

    private RowMapper<BlcProductFeaturedRecord> rm = RecordMapper.newInstance(BlcProductFeaturedRecord.class);

    public BaseBlcProductFeaturedTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductFeaturedRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_FEATURED";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductFeaturedRecord.class;
    }
}
