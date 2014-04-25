package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcBankAccountPaymentTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcBankAccountPaymentTable extends BaseTable<BlcBankAccountPaymentRecord> {

    private RowMapper<BlcBankAccountPaymentRecord> rm = RecordMapper.newInstance(BlcBankAccountPaymentRecord.class);

    public BaseBlcBankAccountPaymentTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcBankAccountPaymentRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_BANK_ACCOUNT_PAYMENT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcBankAccountPaymentRecord.class;
    }
}
