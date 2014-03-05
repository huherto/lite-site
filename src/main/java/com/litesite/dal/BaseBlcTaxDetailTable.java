package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
