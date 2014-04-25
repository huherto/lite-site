package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcProductUpSaleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductUpSaleTable extends BaseTable<BlcProductUpSaleRecord> {

    private RowMapper<BlcProductUpSaleRecord> rm = RecordMapper.newInstance(BlcProductUpSaleRecord.class);

    public BaseBlcProductUpSaleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductUpSaleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_UP_SALE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductUpSaleRecord.class;
    }
}
