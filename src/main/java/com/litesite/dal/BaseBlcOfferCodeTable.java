package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcOfferCodeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferCodeTable extends BaseTable<BlcOfferCodeRecord> {

    private RowMapper<BlcOfferCodeRecord> rm = RecordMapper.newInstance(BlcOfferCodeRecord.class);

    public BaseBlcOfferCodeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferCodeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_CODE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferCodeRecord.class;
    }
}
