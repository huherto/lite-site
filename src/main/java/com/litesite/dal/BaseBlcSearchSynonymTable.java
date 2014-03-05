package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSearchSynonymTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSearchSynonymTable extends BaseTable<BlcSearchSynonymRecord> {

    private RowMapper<BlcSearchSynonymRecord> rm = RecordMapper.newInstance(BlcSearchSynonymRecord.class);

    public BaseBlcSearchSynonymTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSearchSynonymRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SEARCH_SYNONYM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSearchSynonymRecord.class;
    }
}
