package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
