package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
