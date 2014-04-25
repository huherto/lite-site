package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcQualCritOfferXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcQualCritOfferXrefTable extends BaseTable<BlcQualCritOfferXrefRecord> {

    private RowMapper<BlcQualCritOfferXrefRecord> rm = RecordMapper.newInstance(BlcQualCritOfferXrefRecord.class);

    public BaseBlcQualCritOfferXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcQualCritOfferXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_QUAL_CRIT_OFFER_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcQualCritOfferXrefRecord.class;
    }
}
