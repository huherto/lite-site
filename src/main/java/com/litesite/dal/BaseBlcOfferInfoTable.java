package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOfferInfoTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferInfoTable extends BaseTable<BlcOfferInfoRecord> {

    private RowMapper<BlcOfferInfoRecord> rm = RecordMapper.newInstance(BlcOfferInfoRecord.class);

    public BaseBlcOfferInfoTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferInfoRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_INFO";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferInfoRecord.class;
    }
}
