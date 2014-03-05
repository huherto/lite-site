package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSkuFulfillmentFlatRatesTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFulfillmentFlatRatesTable extends BaseTable<BlcSkuFulfillmentFlatRatesRecord> {

    private RowMapper<BlcSkuFulfillmentFlatRatesRecord> rm = RecordMapper.newInstance(BlcSkuFulfillmentFlatRatesRecord.class);

    public BaseBlcSkuFulfillmentFlatRatesTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuFulfillmentFlatRatesRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_FULFILLMENT_FLAT_RATES";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuFulfillmentFlatRatesRecord.class;
    }
}
