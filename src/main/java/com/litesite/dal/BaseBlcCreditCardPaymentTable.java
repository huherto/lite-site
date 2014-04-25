package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCreditCardPaymentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCreditCardPaymentTable extends BaseTable<BlcCreditCardPaymentRecord> {

    private RowMapper<BlcCreditCardPaymentRecord> rm = RecordMapper.newInstance(BlcCreditCardPaymentRecord.class);

    public BaseBlcCreditCardPaymentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCreditCardPaymentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CREDIT_CARD_PAYMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCreditCardPaymentRecord.class;
    }
}
