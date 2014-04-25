package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderAdjustmentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderAdjustmentTable extends BaseTable<BlcOrderAdjustmentRecord> {

    private RowMapper<BlcOrderAdjustmentRecord> rm = RecordMapper.newInstance(BlcOrderAdjustmentRecord.class);

    public BaseBlcOrderAdjustmentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderAdjustmentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ADJUSTMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderAdjustmentRecord.class;
    }
}
