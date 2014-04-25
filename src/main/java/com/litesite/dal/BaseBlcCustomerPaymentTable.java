package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCustomerPaymentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPaymentTable extends BaseTable<BlcCustomerPaymentRecord> {

    private RowMapper<BlcCustomerPaymentRecord> rm = RecordMapper.newInstance(BlcCustomerPaymentRecord.class);

    public BaseBlcCustomerPaymentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerPaymentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_PAYMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerPaymentRecord.class;
    }
}
