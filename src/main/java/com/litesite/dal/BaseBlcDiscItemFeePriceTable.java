package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcDiscItemFeePriceTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDiscItemFeePriceTable extends BaseTable<BlcDiscItemFeePriceRecord> {

    private RowMapper<BlcDiscItemFeePriceRecord> rm = RecordMapper.newInstance(BlcDiscItemFeePriceRecord.class);

    public BaseBlcDiscItemFeePriceTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcDiscItemFeePriceRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_DISC_ITEM_FEE_PRICE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcDiscItemFeePriceRecord.class;
    }
}
