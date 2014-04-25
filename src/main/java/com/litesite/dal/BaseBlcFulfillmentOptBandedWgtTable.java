package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFulfillmentOptBandedWgtTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentOptBandedWgtTable extends BaseTable<BlcFulfillmentOptBandedWgtRecord> {

    private RowMapper<BlcFulfillmentOptBandedWgtRecord> rm = RecordMapper.newInstance(BlcFulfillmentOptBandedWgtRecord.class);

    public BaseBlcFulfillmentOptBandedWgtTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentOptBandedWgtRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_OPT_BANDED_WGT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentOptBandedWgtRecord.class;
    }
}
