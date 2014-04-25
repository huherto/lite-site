package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcStaticAssetStrgTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcStaticAssetStrgTable extends BaseTable<BlcStaticAssetStrgRecord> {

    private RowMapper<BlcStaticAssetStrgRecord> rm = RecordMapper.newInstance(BlcStaticAssetStrgRecord.class);

    public BaseBlcStaticAssetStrgTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcStaticAssetStrgRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_STATIC_ASSET_STRG";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcStaticAssetStrgRecord.class;
    }
}
