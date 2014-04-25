package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFldEnumTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldEnumTable extends BaseTable<BlcFldEnumRecord> {

    private RowMapper<BlcFldEnumRecord> rm = RecordMapper.newInstance(BlcFldEnumRecord.class);

    public BaseBlcFldEnumTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFldEnumRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FLD_ENUM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFldEnumRecord.class;
    }
}
