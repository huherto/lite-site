package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
