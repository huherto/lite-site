package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
