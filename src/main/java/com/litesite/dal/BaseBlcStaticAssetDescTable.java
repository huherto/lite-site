package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcStaticAssetDescTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStaticAssetDescTable extends BaseTable<BlcStaticAssetDescRecord> {

    private RowMapper<BlcStaticAssetDescRecord> rm = RecordMapper.newInstance(BlcStaticAssetDescRecord.class);

    public BaseBlcStaticAssetDescTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcStaticAssetDescRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_STATIC_ASSET_DESC";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcStaticAssetDescRecord.class;
    }
}
