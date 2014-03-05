package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
