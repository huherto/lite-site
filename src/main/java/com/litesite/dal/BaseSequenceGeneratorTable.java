package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseSequenceGeneratorTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseSequenceGeneratorTable extends BaseTable<SequenceGeneratorRecord> {

    private RowMapper<SequenceGeneratorRecord> rm = RecordMapper.newInstance(SequenceGeneratorRecord.class);

    public BaseSequenceGeneratorTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<SequenceGeneratorRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "SEQUENCE_GENERATOR";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return SequenceGeneratorRecord.class;
    }
}
