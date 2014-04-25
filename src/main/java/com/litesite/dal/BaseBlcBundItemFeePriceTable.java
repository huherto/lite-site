package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcBundItemFeePriceTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcBundItemFeePriceTable extends BaseTable<BlcBundItemFeePriceRecord> {

    private RowMapper<BlcBundItemFeePriceRecord> rm = RecordMapper.newInstance(BlcBundItemFeePriceRecord.class);

    public BaseBlcBundItemFeePriceTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcBundItemFeePriceRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_BUND_ITEM_FEE_PRICE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcBundItemFeePriceRecord.class;
    }
}
