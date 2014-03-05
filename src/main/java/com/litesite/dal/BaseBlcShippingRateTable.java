package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
