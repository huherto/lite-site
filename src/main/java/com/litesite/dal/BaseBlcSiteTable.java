package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSiteTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSiteTable extends BaseTable<BlcSiteRecord> {

    private RowMapper<BlcSiteRecord> rm = RecordMapper.newInstance(BlcSiteRecord.class);

    public BaseBlcSiteTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSiteRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SITE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSiteRecord.class;
    }
}
