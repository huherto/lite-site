package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCategoryMediaMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCategoryMediaMapTable extends BaseTable<BlcCategoryMediaMapRecord> {

    private RowMapper<BlcCategoryMediaMapRecord> rm = RecordMapper.newInstance(BlcCategoryMediaMapRecord.class);

    public BaseBlcCategoryMediaMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCategoryMediaMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATEGORY_MEDIA_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCategoryMediaMapRecord.class;
    }
}
