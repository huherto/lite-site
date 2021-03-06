package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderPaymentDetailsTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderPaymentDetailsTable extends BaseTable<BlcOrderPaymentDetailsRecord> {

    private RowMapper<BlcOrderPaymentDetailsRecord> rm = RecordMapper.newInstance(BlcOrderPaymentDetailsRecord.class);

    public BaseBlcOrderPaymentDetailsTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderPaymentDetailsRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_PAYMENT_DETAILS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderPaymentDetailsRecord.class;
    }
}
