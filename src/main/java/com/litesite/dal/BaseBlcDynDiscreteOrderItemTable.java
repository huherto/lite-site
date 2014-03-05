package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcDynDiscreteOrderItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDynDiscreteOrderItemTable extends BaseTable<BlcDynDiscreteOrderItemRecord> {

    private RowMapper<BlcDynDiscreteOrderItemRecord> rm = RecordMapper.newInstance(BlcDynDiscreteOrderItemRecord.class);

    public BaseBlcDynDiscreteOrderItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcDynDiscreteOrderItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_DYN_DISCRETE_ORDER_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcDynDiscreteOrderItemRecord.class;
    }
}
