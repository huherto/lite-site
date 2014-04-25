package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCategoryImageTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryImageTable extends BaseTable<BlcCategoryImageRecord> {

    private RowMapper<BlcCategoryImageRecord> rm = RecordMapper.newInstance(BlcCategoryImageRecord.class);

    public BaseBlcCategoryImageTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCategoryImageRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATEGORY_IMAGE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCategoryImageRecord.class;
    }
}
