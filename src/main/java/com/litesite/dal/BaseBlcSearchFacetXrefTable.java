package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSearchFacetXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchFacetXrefTable extends BaseTable<BlcSearchFacetXrefRecord> {

    private RowMapper<BlcSearchFacetXrefRecord> rm = RecordMapper.newInstance(BlcSearchFacetXrefRecord.class);

    public BaseBlcSearchFacetXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSearchFacetXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SEARCH_FACET_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSearchFacetXrefRecord.class;
    }
}
