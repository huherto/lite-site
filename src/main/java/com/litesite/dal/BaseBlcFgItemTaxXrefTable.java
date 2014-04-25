package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFgItemTaxXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgItemTaxXrefTable extends BaseTable<BlcFgItemTaxXrefRecord> {

    private RowMapper<BlcFgItemTaxXrefRecord> rm = RecordMapper.newInstance(BlcFgItemTaxXrefRecord.class);

    public BaseBlcFgItemTaxXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFgItemTaxXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FG_ITEM_TAX_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFgItemTaxXrefRecord.class;
    }
}
