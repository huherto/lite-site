package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcProductSkuXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductSkuXrefTable extends BaseTable<BlcProductSkuXrefRecord> {

    private RowMapper<BlcProductSkuXrefRecord> rm = RecordMapper.newInstance(BlcProductSkuXrefRecord.class);

    public BaseBlcProductSkuXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductSkuXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_SKU_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductSkuXrefRecord.class;
    }
}
