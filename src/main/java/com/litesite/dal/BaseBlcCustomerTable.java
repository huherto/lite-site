package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCustomerTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerTable extends BaseTable<BlcCustomerRecord> {

    private RowMapper<BlcCustomerRecord> rm = RecordMapper.newInstance(BlcCustomerRecord.class);

    public BaseBlcCustomerTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerRecord.class;
    }
}
