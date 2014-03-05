package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

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
