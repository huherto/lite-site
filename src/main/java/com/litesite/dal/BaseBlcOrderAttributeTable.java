package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcOrderAttributeTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderAttributeTable extends BaseTable<BlcOrderAttributeRecord> {

    private RowMapper<BlcOrderAttributeRecord> rm = RecordMapper.newInstance(BlcOrderAttributeRecord.class);

    public BaseBlcOrderAttributeTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderAttributeRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_ATTRIBUTE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderAttributeRecord.class;
    }
}
