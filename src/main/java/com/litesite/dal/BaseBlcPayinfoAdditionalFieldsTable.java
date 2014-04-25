package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPayinfoAdditionalFieldsTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPayinfoAdditionalFieldsTable extends BaseTable<BlcPayinfoAdditionalFieldsRecord> {

    private RowMapper<BlcPayinfoAdditionalFieldsRecord> rm = RecordMapper.newInstance(BlcPayinfoAdditionalFieldsRecord.class);

    public BaseBlcPayinfoAdditionalFieldsTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPayinfoAdditionalFieldsRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAYINFO_ADDITIONAL_FIELDS";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPayinfoAdditionalFieldsRecord.class;
    }
}
