package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
