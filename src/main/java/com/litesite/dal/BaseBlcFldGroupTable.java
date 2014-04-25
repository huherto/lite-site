package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFldGroupTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldGroupTable extends BaseTable<BlcFldGroupRecord> {

    private RowMapper<BlcFldGroupRecord> rm = RecordMapper.newInstance(BlcFldGroupRecord.class);

    public BaseBlcFldGroupTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFldGroupRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FLD_GROUP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFldGroupRecord.class;
    }
}
