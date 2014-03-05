package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSkuFulfillmentExcludedTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFulfillmentExcludedTable extends BaseTable<BlcSkuFulfillmentExcludedRecord> {

    private RowMapper<BlcSkuFulfillmentExcludedRecord> rm = RecordMapper.newInstance(BlcSkuFulfillmentExcludedRecord.class);

    public BaseBlcSkuFulfillmentExcludedTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuFulfillmentExcludedRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_FULFILLMENT_EXCLUDED";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuFulfillmentExcludedRecord.class;
    }
}
