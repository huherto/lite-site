package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPageRuleMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageRuleMapTable extends BaseTable<BlcPageRuleMapRecord> {

    private RowMapper<BlcPageRuleMapRecord> rm = RecordMapper.newInstance(BlcPageRuleMapRecord.class);

    public BaseBlcPageRuleMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageRuleMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE_RULE_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageRuleMapRecord.class;
    }
}
