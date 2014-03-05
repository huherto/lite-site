package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSiteSandboxTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSiteSandboxTable extends BaseTable<BlcSiteSandboxRecord> {

    private RowMapper<BlcSiteSandboxRecord> rm = RecordMapper.newInstance(BlcSiteSandboxRecord.class);

    public BaseBlcSiteSandboxTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSiteSandboxRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SITE_SANDBOX";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSiteSandboxRecord.class;
    }
}
