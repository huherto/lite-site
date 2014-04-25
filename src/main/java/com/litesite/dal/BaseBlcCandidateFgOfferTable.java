package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCandidateFgOfferTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCandidateFgOfferTable extends BaseTable<BlcCandidateFgOfferRecord> {

    private RowMapper<BlcCandidateFgOfferRecord> rm = RecordMapper.newInstance(BlcCandidateFgOfferRecord.class);

    public BaseBlcCandidateFgOfferTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCandidateFgOfferRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CANDIDATE_FG_OFFER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCandidateFgOfferRecord.class;
    }
}
