package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcQualCritPageXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcQualCritPageXrefTable extends BaseTable<BlcQualCritPageXrefRecord> {

    private RowMapper<BlcQualCritPageXrefRecord> rm = RecordMapper.newInstance(BlcQualCritPageXrefRecord.class);

    public BaseBlcQualCritPageXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcQualCritPageXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_QUAL_CRIT_PAGE_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcQualCritPageXrefRecord.class;
    }
}
