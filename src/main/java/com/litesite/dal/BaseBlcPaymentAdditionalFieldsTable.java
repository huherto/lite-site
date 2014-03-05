package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPaymentAdditionalFieldsTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPaymentAdditionalFieldsTable extends BaseTable<BlcPaymentAdditionalFieldsRecord> {

    private RowMapper<BlcPaymentAdditionalFieldsRecord> rm = RecordMapper.newInstance(BlcPaymentAdditionalFieldsRecord.class);

    public BaseBlcPaymentAdditionalFieldsTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPaymentAdditionalFieldsRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAYMENT_ADDITIONAL_FIELDS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPaymentAdditionalFieldsRecord.class;
    }
}
