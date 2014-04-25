package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFulfillmentGroupItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentGroupItemTable extends BaseTable<BlcFulfillmentGroupItemRecord> {

    private RowMapper<BlcFulfillmentGroupItemRecord> rm = RecordMapper.newInstance(BlcFulfillmentGroupItemRecord.class);

    public BaseBlcFulfillmentGroupItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentGroupItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_GROUP_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentGroupItemRecord.class;
    }
}
