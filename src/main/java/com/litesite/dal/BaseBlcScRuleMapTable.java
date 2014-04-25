package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcScRuleMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScRuleMapTable extends BaseTable<BlcScRuleMapRecord> {

    private RowMapper<BlcScRuleMapRecord> rm = RecordMapper.newInstance(BlcScRuleMapRecord.class);

    public BaseBlcScRuleMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScRuleMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_RULE_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScRuleMapRecord.class;
    }
}
