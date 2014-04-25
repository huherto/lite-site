package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcGiftwrapOrderItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcGiftwrapOrderItemTable extends BaseTable<BlcGiftwrapOrderItemRecord> {

    private RowMapper<BlcGiftwrapOrderItemRecord> rm = RecordMapper.newInstance(BlcGiftwrapOrderItemRecord.class);

    public BaseBlcGiftwrapOrderItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcGiftwrapOrderItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_GIFTWRAP_ORDER_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcGiftwrapOrderItemRecord.class;
    }
}
