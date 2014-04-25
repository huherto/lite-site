package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFulfillmentOptBandedPrcTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentOptBandedPrcTable extends BaseTable<BlcFulfillmentOptBandedPrcRecord> {

    private RowMapper<BlcFulfillmentOptBandedPrcRecord> rm = RecordMapper.newInstance(BlcFulfillmentOptBandedPrcRecord.class);

    public BaseBlcFulfillmentOptBandedPrcTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentOptBandedPrcRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_OPT_BANDED_PRC";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentOptBandedPrcRecord.class;
    }
}
