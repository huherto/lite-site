package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcScFldTmpltTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldTmpltTable extends BaseTable<BlcScFldTmpltRecord> {

    private RowMapper<BlcScFldTmpltRecord> rm = RecordMapper.newInstance(BlcScFldTmpltRecord.class);

    public BaseBlcScFldTmpltTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScFldTmpltRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_FLD_TMPLT";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScFldTmpltRecord.class;
    }
}
