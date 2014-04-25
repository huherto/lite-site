package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcQualCritScXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcQualCritScXrefTable extends BaseTable<BlcQualCritScXrefRecord> {

    private RowMapper<BlcQualCritScXrefRecord> rm = RecordMapper.newInstance(BlcQualCritScXrefRecord.class);

    public BaseBlcQualCritScXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcQualCritScXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_QUAL_CRIT_SC_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcQualCritScXrefRecord.class;
    }
}
