package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcFgAdjustmentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgAdjustmentTable extends BaseTable<BlcFgAdjustmentRecord> {

    private RowMapper<BlcFgAdjustmentRecord> rm = RecordMapper.newInstance(BlcFgAdjustmentRecord.class);

    public BaseBlcFgAdjustmentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFgAdjustmentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FG_ADJUSTMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFgAdjustmentRecord.class;
    }
}
