package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdditionalOfferInfoTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdditionalOfferInfoTable extends BaseTable<BlcAdditionalOfferInfoRecord> {

    private RowMapper<BlcAdditionalOfferInfoRecord> rm = RecordMapper.newInstance(BlcAdditionalOfferInfoRecord.class);

    public BaseBlcAdditionalOfferInfoTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdditionalOfferInfoRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADDITIONAL_OFFER_INFO";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdditionalOfferInfoRecord.class;
    }
}
