package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcFldDefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcFldDefTable extends BaseTable<BlcFldDefRecord> {

    private RowMapper<BlcFldDefRecord> rm = RecordMapper.newInstance(BlcFldDefRecord.class);

    public BaseBlcFldDefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcFldDefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_FLD_DEF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcFldDefRecord.class;
    }
}
