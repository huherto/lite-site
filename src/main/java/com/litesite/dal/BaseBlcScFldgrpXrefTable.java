package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcScFldgrpXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldgrpXrefTable extends BaseTable<BlcScFldgrpXrefRecord> {

    private RowMapper<BlcScFldgrpXrefRecord> rm = RecordMapper.newInstance(BlcScFldgrpXrefRecord.class);

    public BaseBlcScFldgrpXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScFldgrpXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_FLDGRP_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScFldgrpXrefRecord.class;
    }
}
