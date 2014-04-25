package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOfferAuditTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOfferAuditTable extends BaseTable<BlcOfferAuditRecord> {

    private RowMapper<BlcOfferAuditRecord> rm = RecordMapper.newInstance(BlcOfferAuditRecord.class);

    public BaseBlcOfferAuditTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOfferAuditRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_OFFER_AUDIT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOfferAuditRecord.class;
    }
}
