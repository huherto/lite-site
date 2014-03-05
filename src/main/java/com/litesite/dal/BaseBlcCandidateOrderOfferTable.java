package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCandidateOrderOfferTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCandidateOrderOfferTable extends BaseTable<BlcCandidateOrderOfferRecord> {

    private RowMapper<BlcCandidateOrderOfferRecord> rm = RecordMapper.newInstance(BlcCandidateOrderOfferRecord.class);

    public BaseBlcCandidateOrderOfferTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCandidateOrderOfferRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CANDIDATE_ORDER_OFFER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCandidateOrderOfferRecord.class;
    }
}
