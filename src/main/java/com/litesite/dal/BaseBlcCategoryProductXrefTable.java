package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCategoryProductXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryProductXrefTable extends BaseTable<BlcCategoryProductXrefRecord> {

    private RowMapper<BlcCategoryProductXrefRecord> rm = RecordMapper.newInstance(BlcCategoryProductXrefRecord.class);

    public BaseBlcCategoryProductXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCategoryProductXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATEGORY_PRODUCT_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCategoryProductXrefRecord.class;
    }
}
