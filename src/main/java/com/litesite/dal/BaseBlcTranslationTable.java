package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

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
