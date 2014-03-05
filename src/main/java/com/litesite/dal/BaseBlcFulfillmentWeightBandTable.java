package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcFulfillmentWeightBandTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFulfillmentWeightBandTable extends BaseTable<BlcFulfillmentWeightBandRecord> {

    private RowMapper<BlcFulfillmentWeightBandRecord> rm = RecordMapper.newInstance(BlcFulfillmentWeightBandRecord.class);

    public BaseBlcFulfillmentWeightBandTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFulfillmentWeightBandRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FULFILLMENT_WEIGHT_BAND";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFulfillmentWeightBandRecord.class;
    }
}
