package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcAdminSecPermXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAdminSecPermXrefTable extends BaseTable<BlcAdminSecPermXrefRecord> {

    private RowMapper<BlcAdminSecPermXrefRecord> rm = RecordMapper.newInstance(BlcAdminSecPermXrefRecord.class);

    public BaseBlcAdminSecPermXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAdminSecPermXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ADMIN_SEC_PERM_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAdminSecPermXrefRecord.class;
    }
}
