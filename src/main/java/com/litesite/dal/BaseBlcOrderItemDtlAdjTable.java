package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderItemDtlAdjTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemDtlAdjTable extends BaseTable<BlcOrderItemDtlAdjRecord> {

    private RowMapper<BlcOrderItemDtlAdjRecord> rm = RecordMapper.newInstance(BlcOrderItemDtlAdjRecord.class);

    public BaseBlcOrderItemDtlAdjTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderItemDtlAdjRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ITEM_DTL_ADJ";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderItemDtlAdjRecord.class;
    }
}
