package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFulfillmentOptionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentOptionTable extends BaseTable<BlcFulfillmentOptionRecord> {

    private RowMapper<BlcFulfillmentOptionRecord> rm = RecordMapper.newInstance(BlcFulfillmentOptionRecord.class);

    public BaseBlcFulfillmentOptionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentOptionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_OPTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentOptionRecord.class;
    }
}
