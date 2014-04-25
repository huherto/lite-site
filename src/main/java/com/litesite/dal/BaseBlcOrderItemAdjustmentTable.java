package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderItemAdjustmentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemAdjustmentTable extends BaseTable<BlcOrderItemAdjustmentRecord> {

    private RowMapper<BlcOrderItemAdjustmentRecord> rm = RecordMapper.newInstance(BlcOrderItemAdjustmentRecord.class);

    public BaseBlcOrderItemAdjustmentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderItemAdjustmentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ITEM_ADJUSTMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderItemAdjustmentRecord.class;
    }
}
