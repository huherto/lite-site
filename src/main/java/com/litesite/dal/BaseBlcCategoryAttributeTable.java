package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCategoryAttributeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryAttributeTable extends BaseTable<BlcCategoryAttributeRecord> {

    private RowMapper<BlcCategoryAttributeRecord> rm = RecordMapper.newInstance(BlcCategoryAttributeRecord.class);

    public BaseBlcCategoryAttributeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCategoryAttributeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATEGORY_ATTRIBUTE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCategoryAttributeRecord.class;
    }
}
