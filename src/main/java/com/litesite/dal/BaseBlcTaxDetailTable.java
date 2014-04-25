package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcTaxDetailTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcTaxDetailTable extends BaseTable<BlcTaxDetailRecord> {

    private RowMapper<BlcTaxDetailRecord> rm = RecordMapper.newInstance(BlcTaxDetailRecord.class);

    public BaseBlcTaxDetailTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcTaxDetailRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_TAX_DETAIL";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcTaxDetailRecord.class;
    }
}
