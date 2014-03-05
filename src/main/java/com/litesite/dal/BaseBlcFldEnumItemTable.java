package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
