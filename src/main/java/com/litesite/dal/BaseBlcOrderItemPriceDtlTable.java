package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderItemPriceDtlTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemPriceDtlTable extends BaseTable<BlcOrderItemPriceDtlRecord> {

    private RowMapper<BlcOrderItemPriceDtlRecord> rm = RecordMapper.newInstance(BlcOrderItemPriceDtlRecord.class);

    public BaseBlcOrderItemPriceDtlTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderItemPriceDtlRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ITEM_PRICE_DTL";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderItemPriceDtlRecord.class;
    }
}
