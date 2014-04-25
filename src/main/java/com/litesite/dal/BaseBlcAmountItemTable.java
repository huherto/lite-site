package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAmountItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAmountItemTable extends BaseTable<BlcAmountItemRecord> {

    private RowMapper<BlcAmountItemRecord> rm = RecordMapper.newInstance(BlcAmountItemRecord.class);

    public BaseBlcAmountItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAmountItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_AMOUNT_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAmountItemRecord.class;
    }
}
