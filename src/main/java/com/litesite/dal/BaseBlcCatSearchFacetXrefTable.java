package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCatSearchFacetXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCatSearchFacetXrefTable extends BaseTable<BlcCatSearchFacetXrefRecord> {

    private RowMapper<BlcCatSearchFacetXrefRecord> rm = RecordMapper.newInstance(BlcCatSearchFacetXrefRecord.class);

    public BaseBlcCatSearchFacetXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCatSearchFacetXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CAT_SEARCH_FACET_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCatSearchFacetXrefRecord.class;
    }
}
