package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
