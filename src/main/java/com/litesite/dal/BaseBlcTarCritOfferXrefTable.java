package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcTarCritOfferXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcTarCritOfferXrefTable extends BaseTable<BlcTarCritOfferXrefRecord> {

    private RowMapper<BlcTarCritOfferXrefRecord> rm = RecordMapper.newInstance(BlcTarCritOfferXrefRecord.class);

    public BaseBlcTarCritOfferXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcTarCritOfferXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_TAR_CRIT_OFFER_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcTarCritOfferXrefRecord.class;
    }
}
