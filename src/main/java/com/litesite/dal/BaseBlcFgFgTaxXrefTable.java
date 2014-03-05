package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcFgFgTaxXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgFgTaxXrefTable extends BaseTable<BlcFgFgTaxXrefRecord> {

    private RowMapper<BlcFgFgTaxXrefRecord> rm = RecordMapper.newInstance(BlcFgFgTaxXrefRecord.class);

    public BaseBlcFgFgTaxXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFgFgTaxXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FG_FG_TAX_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFgFgTaxXrefRecord.class;
    }
}
