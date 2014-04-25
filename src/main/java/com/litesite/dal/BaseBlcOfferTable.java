package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOfferTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferTable extends BaseTable<BlcOfferRecord> {

    private RowMapper<BlcOfferRecord> rm = RecordMapper.newInstance(BlcOfferRecord.class);

    public BaseBlcOfferTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferRecord.class;
    }
}
