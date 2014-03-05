package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
