package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFulfillmentOptionFixedTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentOptionFixedTable extends BaseTable<BlcFulfillmentOptionFixedRecord> {

    private RowMapper<BlcFulfillmentOptionFixedRecord> rm = RecordMapper.newInstance(BlcFulfillmentOptionFixedRecord.class);

    public BaseBlcFulfillmentOptionFixedTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentOptionFixedRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_OPTION_FIXED";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentOptionFixedRecord.class;
    }
}
