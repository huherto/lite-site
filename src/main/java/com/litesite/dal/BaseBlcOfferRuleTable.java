package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOfferRuleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferRuleTable extends BaseTable<BlcOfferRuleRecord> {

    private RowMapper<BlcOfferRuleRecord> rm = RecordMapper.newInstance(BlcOfferRuleRecord.class);

    public BaseBlcOfferRuleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferRuleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_RULE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferRuleRecord.class;
    }
}
