package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

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
