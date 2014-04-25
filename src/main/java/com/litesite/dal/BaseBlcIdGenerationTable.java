package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcIdGenerationTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcIdGenerationTable extends BaseTable<BlcIdGenerationRecord> {

    private RowMapper<BlcIdGenerationRecord> rm = RecordMapper.newInstance(BlcIdGenerationRecord.class);

    public BaseBlcIdGenerationTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcIdGenerationRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ID_GENERATION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcIdGenerationRecord.class;
    }
}
