package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSkuAttributeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuAttributeTable extends BaseTable<BlcSkuAttributeRecord> {

    private RowMapper<BlcSkuAttributeRecord> rm = RecordMapper.newInstance(BlcSkuAttributeRecord.class);

    public BaseBlcSkuAttributeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuAttributeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_ATTRIBUTE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuAttributeRecord.class;
    }
}
