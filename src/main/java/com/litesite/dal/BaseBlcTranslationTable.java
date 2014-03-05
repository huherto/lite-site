package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcTranslationTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcTranslationTable extends BaseTable<BlcTranslationRecord> {

    private RowMapper<BlcTranslationRecord> rm = RecordMapper.newInstance(BlcTranslationRecord.class);

    public BaseBlcTranslationTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcTranslationRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_TRANSLATION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcTranslationRecord.class;
    }
}
