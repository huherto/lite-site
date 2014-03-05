package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCatalogTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCatalogTable extends BaseTable<BlcCatalogRecord> {

    private RowMapper<BlcCatalogRecord> rm = RecordMapper.newInstance(BlcCatalogRecord.class);

    public BaseBlcCatalogTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCatalogRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CATALOG";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCatalogRecord.class;
    }
}
