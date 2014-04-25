package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFulfillmentGroupTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentGroupTable extends BaseTable<BlcFulfillmentGroupRecord> {

    private RowMapper<BlcFulfillmentGroupRecord> rm = RecordMapper.newInstance(BlcFulfillmentGroupRecord.class);

    public BaseBlcFulfillmentGroupTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentGroupRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_GROUP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentGroupRecord.class;
    }
}
