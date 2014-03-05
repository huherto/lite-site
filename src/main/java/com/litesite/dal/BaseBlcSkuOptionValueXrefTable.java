package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSkuOptionValueXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuOptionValueXrefTable extends BaseTable<BlcSkuOptionValueXrefRecord> {

    private RowMapper<BlcSkuOptionValueXrefRecord> rm = RecordMapper.newInstance(BlcSkuOptionValueXrefRecord.class);

    public BaseBlcSkuOptionValueXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuOptionValueXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_OPTION_VALUE_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuOptionValueXrefRecord.class;
    }
}
