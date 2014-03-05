package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
