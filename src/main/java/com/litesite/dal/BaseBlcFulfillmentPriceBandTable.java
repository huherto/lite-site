package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcFulfillmentPriceBandTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentPriceBandTable extends BaseTable<BlcFulfillmentPriceBandRecord> {

    private RowMapper<BlcFulfillmentPriceBandRecord> rm = RecordMapper.newInstance(BlcFulfillmentPriceBandRecord.class);

    public BaseBlcFulfillmentPriceBandTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentPriceBandRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_PRICE_BAND";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentPriceBandRecord.class;
    }
}
