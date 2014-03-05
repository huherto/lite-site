package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
