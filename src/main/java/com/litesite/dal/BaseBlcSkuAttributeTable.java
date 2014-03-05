package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
