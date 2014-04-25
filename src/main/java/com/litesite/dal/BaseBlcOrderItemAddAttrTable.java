package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderItemAddAttrTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemAddAttrTable extends BaseTable<BlcOrderItemAddAttrRecord> {

    private RowMapper<BlcOrderItemAddAttrRecord> rm = RecordMapper.newInstance(BlcOrderItemAddAttrRecord.class);

    public BaseBlcOrderItemAddAttrTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderItemAddAttrRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ITEM_ADD_ATTR";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderItemAddAttrRecord.class;
    }
}
