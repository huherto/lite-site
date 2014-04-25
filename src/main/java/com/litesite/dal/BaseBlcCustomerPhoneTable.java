package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCustomerPhoneTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPhoneTable extends BaseTable<BlcCustomerPhoneRecord> {

    private RowMapper<BlcCustomerPhoneRecord> rm = RecordMapper.newInstance(BlcCustomerPhoneRecord.class);

    public BaseBlcCustomerPhoneTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerPhoneRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_PHONE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerPhoneRecord.class;
    }
}
