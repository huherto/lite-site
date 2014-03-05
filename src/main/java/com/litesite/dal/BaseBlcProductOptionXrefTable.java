package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcProductOptionXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductOptionXrefTable extends BaseTable<BlcProductOptionXrefRecord> {

    private RowMapper<BlcProductOptionXrefRecord> rm = RecordMapper.newInstance(BlcProductOptionXrefRecord.class);

    public BaseBlcProductOptionXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductOptionXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_OPTION_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductOptionXrefRecord.class;
    }
}
