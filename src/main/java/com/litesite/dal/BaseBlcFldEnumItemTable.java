package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFldEnumItemTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldEnumItemTable extends BaseTable<BlcFldEnumItemRecord> {

    private RowMapper<BlcFldEnumItemRecord> rm = RecordMapper.newInstance(BlcFldEnumItemRecord.class);

    public BaseBlcFldEnumItemTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFldEnumItemRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FLD_ENUM_ITEM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFldEnumItemRecord.class;
    }
}
