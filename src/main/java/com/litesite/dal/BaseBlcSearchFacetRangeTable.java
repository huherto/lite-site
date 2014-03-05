package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
