package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSkuAvailabilityTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuAvailabilityTable extends BaseTable<BlcSkuAvailabilityRecord> {

    private RowMapper<BlcSkuAvailabilityRecord> rm = RecordMapper.newInstance(BlcSkuAvailabilityRecord.class);

    public BaseBlcSkuAvailabilityTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuAvailabilityRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_AVAILABILITY";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuAvailabilityRecord.class;
    }
}
