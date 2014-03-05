package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcFulfillmentGroupFeeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentGroupFeeTable extends BaseTable<BlcFulfillmentGroupFeeRecord> {

    private RowMapper<BlcFulfillmentGroupFeeRecord> rm = RecordMapper.newInstance(BlcFulfillmentGroupFeeRecord.class);

    public BaseBlcFulfillmentGroupFeeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentGroupFeeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_GROUP_FEE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentGroupFeeRecord.class;
    }
}
