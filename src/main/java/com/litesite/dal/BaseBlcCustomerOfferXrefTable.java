package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCustomerOfferXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerOfferXrefTable extends BaseTable<BlcCustomerOfferXrefRecord> {

    private RowMapper<BlcCustomerOfferXrefRecord> rm = RecordMapper.newInstance(BlcCustomerOfferXrefRecord.class);

    public BaseBlcCustomerOfferXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerOfferXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_OFFER_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerOfferXrefRecord.class;
    }
}
