package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCustomerPaymentFieldsTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerPaymentFieldsTable extends BaseTable<BlcCustomerPaymentFieldsRecord> {

    private RowMapper<BlcCustomerPaymentFieldsRecord> rm = RecordMapper.newInstance(BlcCustomerPaymentFieldsRecord.class);

    public BaseBlcCustomerPaymentFieldsTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerPaymentFieldsRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_PAYMENT_FIELDS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerPaymentFieldsRecord.class;
    }
}
