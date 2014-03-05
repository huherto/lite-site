package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcProductAttributeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductAttributeTable extends BaseTable<BlcProductAttributeRecord> {

    private RowMapper<BlcProductAttributeRecord> rm = RecordMapper.newInstance(BlcProductAttributeRecord.class);

    public BaseBlcProductAttributeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductAttributeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_ATTRIBUTE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductAttributeRecord.class;
    }
}
