package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
