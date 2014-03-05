package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcScRuleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScRuleTable extends BaseTable<BlcScRuleRecord> {

    private RowMapper<BlcScRuleRecord> rm = RecordMapper.newInstance(BlcScRuleRecord.class);

    public BaseBlcScRuleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScRuleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_RULE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScRuleRecord.class;
    }
}
