package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcProductOptionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductOptionTable extends BaseTable<BlcProductOptionRecord> {

    private RowMapper<BlcProductOptionRecord> rm = RecordMapper.newInstance(BlcProductOptionRecord.class);

    public BaseBlcProductOptionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductOptionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_OPTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductOptionRecord.class;
    }
}
