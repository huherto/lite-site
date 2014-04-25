package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCustomerPasswordTokenTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPasswordTokenTable extends BaseTable<BlcCustomerPasswordTokenRecord> {

    private RowMapper<BlcCustomerPasswordTokenRecord> rm = RecordMapper.newInstance(BlcCustomerPasswordTokenRecord.class);

    public BaseBlcCustomerPasswordTokenTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerPasswordTokenRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_PASSWORD_TOKEN";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerPasswordTokenRecord.class;
    }
}
