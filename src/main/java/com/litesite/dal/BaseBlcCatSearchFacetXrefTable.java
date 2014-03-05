package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
