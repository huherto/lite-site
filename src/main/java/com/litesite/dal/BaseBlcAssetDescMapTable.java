package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcAssetDescMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcAssetDescMapTable extends BaseTable<BlcAssetDescMapRecord> {

    private RowMapper<BlcAssetDescMapRecord> rm = RecordMapper.newInstance(BlcAssetDescMapRecord.class);

    public BaseBlcAssetDescMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcAssetDescMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ASSET_DESC_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcAssetDescMapRecord.class;
    }
}
