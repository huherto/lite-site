package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcProductOptionValueTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductOptionValueTable extends BaseTable<BlcProductOptionValueRecord> {

    private RowMapper<BlcProductOptionValueRecord> rm = RecordMapper.newInstance(BlcProductOptionValueRecord.class);

    public BaseBlcProductOptionValueTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductOptionValueRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_OPTION_VALUE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductOptionValueRecord.class;
    }
}
