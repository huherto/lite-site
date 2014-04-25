package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcSkuMediaMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuMediaMapTable extends BaseTable<BlcSkuMediaMapRecord> {

    private RowMapper<BlcSkuMediaMapRecord> rm = RecordMapper.newInstance(BlcSkuMediaMapRecord.class);

    public BaseBlcSkuMediaMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuMediaMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_MEDIA_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuMediaMapRecord.class;
    }
}
