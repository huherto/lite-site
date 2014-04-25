package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcCandidateItemOfferTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCandidateItemOfferTable extends BaseTable<BlcCandidateItemOfferRecord> {

    private RowMapper<BlcCandidateItemOfferRecord> rm = RecordMapper.newInstance(BlcCandidateItemOfferRecord.class);

    public BaseBlcCandidateItemOfferTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCandidateItemOfferRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CANDIDATE_ITEM_OFFER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCandidateItemOfferRecord.class;
    }
}
