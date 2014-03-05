package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
