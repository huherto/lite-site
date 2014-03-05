package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCatSearchFacetExclXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCatSearchFacetExclXrefTable extends BaseTable<BlcCatSearchFacetExclXrefRecord> {

    private RowMapper<BlcCatSearchFacetExclXrefRecord> rm = RecordMapper.newInstance(BlcCatSearchFacetExclXrefRecord.class);

    public BaseBlcCatSearchFacetExclXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCatSearchFacetExclXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CAT_SEARCH_FACET_EXCL_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCatSearchFacetExclXrefRecord.class;
    }
}
