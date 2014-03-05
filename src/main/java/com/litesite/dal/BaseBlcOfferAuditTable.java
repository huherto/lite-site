package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
