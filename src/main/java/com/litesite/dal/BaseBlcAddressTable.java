package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAddressTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAddressTable extends BaseTable<BlcAddressRecord> {

    private RowMapper<BlcAddressRecord> rm = RecordMapper.newInstance(BlcAddressRecord.class);

    public BaseBlcAddressTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAddressRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADDRESS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAddressRecord.class;
    }
}
