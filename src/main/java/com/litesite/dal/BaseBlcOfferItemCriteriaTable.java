package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOfferItemCriteriaTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferItemCriteriaTable extends BaseTable<BlcOfferItemCriteriaRecord> {

    private RowMapper<BlcOfferItemCriteriaRecord> rm = RecordMapper.newInstance(BlcOfferItemCriteriaRecord.class);

    public BaseBlcOfferItemCriteriaTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferItemCriteriaRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_ITEM_CRITERIA";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferItemCriteriaRecord.class;
    }
}
