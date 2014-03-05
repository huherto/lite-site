package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcCustomerRoleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcCustomerRoleTable extends BaseTable<BlcCustomerRoleRecord> {

    private RowMapper<BlcCustomerRoleRecord> rm = RecordMapper.newInstance(BlcCustomerRoleRecord.class);

    public BaseBlcCustomerRoleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcCustomerRoleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_CUSTOMER_ROLE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcCustomerRoleRecord.class;
    }
}