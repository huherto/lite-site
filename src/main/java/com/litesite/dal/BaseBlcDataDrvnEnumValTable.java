package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcDataDrvnEnumValTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcDataDrvnEnumValTable extends BaseTable<BlcDataDrvnEnumValRecord> {

    private RowMapper<BlcDataDrvnEnumValRecord> rm = RecordMapper.newInstance(BlcDataDrvnEnumValRecord.class);

    public BaseBlcDataDrvnEnumValTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcDataDrvnEnumValRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_DATA_DRVN_ENUM_VAL";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcDataDrvnEnumValRecord.class;
    }
}
