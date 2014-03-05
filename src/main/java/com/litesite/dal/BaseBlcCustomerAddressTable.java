package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCustomerAddressTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerAddressTable extends BaseTable<BlcCustomerAddressRecord> {

    private RowMapper<BlcCustomerAddressRecord> rm = RecordMapper.newInstance(BlcCustomerAddressRecord.class);

    public BaseBlcCustomerAddressTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerAddressRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_ADDRESS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerAddressRecord.class;
    }
}
