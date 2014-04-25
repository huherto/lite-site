package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcItemOfferQualifierTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcItemOfferQualifierTable extends BaseTable<BlcItemOfferQualifierRecord> {

    private RowMapper<BlcItemOfferQualifierRecord> rm = RecordMapper.newInstance(BlcItemOfferQualifierRecord.class);

    public BaseBlcItemOfferQualifierTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcItemOfferQualifierRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ITEM_OFFER_QUALIFIER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcItemOfferQualifierRecord.class;
    }
}
