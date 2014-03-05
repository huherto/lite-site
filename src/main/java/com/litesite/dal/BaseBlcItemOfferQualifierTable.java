package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
