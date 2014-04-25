package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCustomerTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerTable extends BaseTable<BlcCustomerRecord> {

    private RowMapper<BlcCustomerRecord> rm = RecordMapper.newInstance(BlcCustomerRecord.class);

    public BaseBlcCustomerTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerRecord.class;
    }
}
