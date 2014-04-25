package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCategoryXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryXrefTable extends BaseTable<BlcCategoryXrefRecord> {

    private RowMapper<BlcCategoryXrefRecord> rm = RecordMapper.newInstance(BlcCategoryXrefRecord.class);

    public BaseBlcCategoryXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCategoryXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATEGORY_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCategoryXrefRecord.class;
    }
}
