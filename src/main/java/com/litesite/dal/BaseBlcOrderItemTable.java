package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcOrderItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderItemTable extends BaseTable<BlcOrderItemRecord> {

    private RowMapper<BlcOrderItemRecord> rm = RecordMapper.newInstance(BlcOrderItemRecord.class);

    public BaseBlcOrderItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderItemRecord.class;
    }
}
