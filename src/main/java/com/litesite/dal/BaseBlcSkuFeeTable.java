package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
