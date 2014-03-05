package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
