package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
