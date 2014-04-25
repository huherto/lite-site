package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderOfferCodeXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderOfferCodeXrefTable extends BaseTable<BlcOrderOfferCodeXrefRecord> {

    private RowMapper<BlcOrderOfferCodeXrefRecord> rm = RecordMapper.newInstance(BlcOrderOfferCodeXrefRecord.class);

    public BaseBlcOrderOfferCodeXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderOfferCodeXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_OFFER_CODE_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderOfferCodeXrefRecord.class;
    }
}
