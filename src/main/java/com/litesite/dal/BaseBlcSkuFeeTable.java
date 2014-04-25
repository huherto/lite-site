package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSkuFeeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFeeTable extends BaseTable<BlcSkuFeeRecord> {

    private RowMapper<BlcSkuFeeRecord> rm = RecordMapper.newInstance(BlcSkuFeeRecord.class);

    public BaseBlcSkuFeeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuFeeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_FEE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuFeeRecord.class;
    }
}
