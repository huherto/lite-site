package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcDataDrvnEnumTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDataDrvnEnumTable extends BaseTable<BlcDataDrvnEnumRecord> {

    private RowMapper<BlcDataDrvnEnumRecord> rm = RecordMapper.newInstance(BlcDataDrvnEnumRecord.class);

    public BaseBlcDataDrvnEnumTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcDataDrvnEnumRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_DATA_DRVN_ENUM";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcDataDrvnEnumRecord.class;
    }
}
