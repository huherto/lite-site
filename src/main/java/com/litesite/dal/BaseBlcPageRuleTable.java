package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPageRuleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageRuleTable extends BaseTable<BlcPageRuleRecord> {

    private RowMapper<BlcPageRuleRecord> rm = RecordMapper.newInstance(BlcPageRuleRecord.class);

    public BaseBlcPageRuleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageRuleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE_RULE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageRuleRecord.class;
    }
}
