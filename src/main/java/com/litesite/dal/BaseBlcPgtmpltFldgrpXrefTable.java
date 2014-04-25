package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPgtmpltFldgrpXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPgtmpltFldgrpXrefTable extends BaseTable<BlcPgtmpltFldgrpXrefRecord> {

    private RowMapper<BlcPgtmpltFldgrpXrefRecord> rm = RecordMapper.newInstance(BlcPgtmpltFldgrpXrefRecord.class);

    public BaseBlcPgtmpltFldgrpXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPgtmpltFldgrpXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PGTMPLT_FLDGRP_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPgtmpltFldgrpXrefRecord.class;
    }
}
