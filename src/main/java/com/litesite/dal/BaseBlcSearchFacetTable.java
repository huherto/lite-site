package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSearchFacetTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchFacetTable extends BaseTable<BlcSearchFacetRecord> {

    private RowMapper<BlcSearchFacetRecord> rm = RecordMapper.newInstance(BlcSearchFacetRecord.class);

    public BaseBlcSearchFacetTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSearchFacetRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SEARCH_FACET";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSearchFacetRecord.class;
    }
}
