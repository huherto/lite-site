package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCategoryTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryTable extends BaseTable<BlcCategoryRecord> {

    private RowMapper<BlcCategoryRecord> rm = RecordMapper.newInstance(BlcCategoryRecord.class);

    public BaseBlcCategoryTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCategoryRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATEGORY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCategoryRecord.class;
    }
}
