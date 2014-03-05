package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCustomerAttributeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerAttributeTable extends BaseTable<BlcCustomerAttributeRecord> {

    private RowMapper<BlcCustomerAttributeRecord> rm = RecordMapper.newInstance(BlcCustomerAttributeRecord.class);

    public BaseBlcCustomerAttributeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerAttributeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_ATTRIBUTE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerAttributeRecord.class;
    }
}
