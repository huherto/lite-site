package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcStaticAssetTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStaticAssetTable extends BaseTable<BlcStaticAssetRecord> {

    private RowMapper<BlcStaticAssetRecord> rm = RecordMapper.newInstance(BlcStaticAssetRecord.class);

    public BaseBlcStaticAssetTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcStaticAssetRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_STATIC_ASSET";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcStaticAssetRecord.class;
    }
}
