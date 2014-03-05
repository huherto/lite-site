package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcFgFeeTaxXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFgFeeTaxXrefTable extends BaseTable<BlcFgFeeTaxXrefRecord> {

    private RowMapper<BlcFgFeeTaxXrefRecord> rm = RecordMapper.newInstance(BlcFgFeeTaxXrefRecord.class);

    public BaseBlcFgFeeTaxXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFgFeeTaxXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FG_FEE_TAX_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFgFeeTaxXrefRecord.class;
    }
}
