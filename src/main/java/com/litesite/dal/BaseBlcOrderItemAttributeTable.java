package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderItemAttributeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemAttributeTable extends BaseTable<BlcOrderItemAttributeRecord> {

    private RowMapper<BlcOrderItemAttributeRecord> rm = RecordMapper.newInstance(BlcOrderItemAttributeRecord.class);

    public BaseBlcOrderItemAttributeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderItemAttributeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ITEM_ATTRIBUTE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderItemAttributeRecord.class;
    }
}
