package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcModuleConfigurationTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcModuleConfigurationTable extends BaseTable<BlcModuleConfigurationRecord> {

    private RowMapper<BlcModuleConfigurationRecord> rm = RecordMapper.newInstance(BlcModuleConfigurationRecord.class);

    public BaseBlcModuleConfigurationTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcModuleConfigurationRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_MODULE_CONFIGURATION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcModuleConfigurationRecord.class;
    }
}
