package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSiteCatalogTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSiteCatalogTable extends BaseTable<BlcSiteCatalogRecord> {

    private RowMapper<BlcSiteCatalogRecord> rm = RecordMapper.newInstance(BlcSiteCatalogRecord.class);

    public BaseBlcSiteCatalogTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSiteCatalogRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SITE_CATALOG";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSiteCatalogRecord.class;
    }
}
