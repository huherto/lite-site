package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
