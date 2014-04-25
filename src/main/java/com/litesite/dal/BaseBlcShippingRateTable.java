package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcShippingRateTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcShippingRateTable extends BaseTable<BlcShippingRateRecord> {

    private RowMapper<BlcShippingRateRecord> rm = RecordMapper.newInstance(BlcShippingRateRecord.class);

    public BaseBlcShippingRateTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcShippingRateRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SHIPPING_RATE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcShippingRateRecord.class;
    }
}
