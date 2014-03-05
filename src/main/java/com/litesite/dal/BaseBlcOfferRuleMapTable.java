package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcOfferRuleMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferRuleMapTable extends BaseTable<BlcOfferRuleMapRecord> {

    private RowMapper<BlcOfferRuleMapRecord> rm = RecordMapper.newInstance(BlcOfferRuleMapRecord.class);

    public BaseBlcOfferRuleMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferRuleMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_RULE_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferRuleMapRecord.class;
    }
}
