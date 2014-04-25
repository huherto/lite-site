package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOfferInfoFieldsTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferInfoFieldsTable extends BaseTable<BlcOfferInfoFieldsRecord> {

    private RowMapper<BlcOfferInfoFieldsRecord> rm = RecordMapper.newInstance(BlcOfferInfoFieldsRecord.class);

    public BaseBlcOfferInfoFieldsTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferInfoFieldsRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_INFO_FIELDS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferInfoFieldsRecord.class;
    }
}
