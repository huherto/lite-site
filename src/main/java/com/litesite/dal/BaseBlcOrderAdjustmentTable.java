package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
