package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSearchFacetRangeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchFacetRangeTable extends BaseTable<BlcSearchFacetRangeRecord> {

    private RowMapper<BlcSearchFacetRangeRecord> rm = RecordMapper.newInstance(BlcSearchFacetRangeRecord.class);

    public BaseBlcSearchFacetRangeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSearchFacetRangeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SEARCH_FACET_RANGE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSearchFacetRangeRecord.class;
    }
}
