package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPersonalMessageTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPersonalMessageTable extends BaseTable<BlcPersonalMessageRecord> {

    private RowMapper<BlcPersonalMessageRecord> rm = RecordMapper.newInstance(BlcPersonalMessageRecord.class);

    public BaseBlcPersonalMessageTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPersonalMessageRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PERSONAL_MESSAGE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPersonalMessageRecord.class;
    }
}
