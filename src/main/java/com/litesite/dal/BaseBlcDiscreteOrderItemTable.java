package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcDiscreteOrderItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDiscreteOrderItemTable extends BaseTable<BlcDiscreteOrderItemRecord> {

    private RowMapper<BlcDiscreteOrderItemRecord> rm = RecordMapper.newInstance(BlcDiscreteOrderItemRecord.class);

    public BaseBlcDiscreteOrderItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcDiscreteOrderItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_DISCRETE_ORDER_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcDiscreteOrderItemRecord.class;
    }
}
