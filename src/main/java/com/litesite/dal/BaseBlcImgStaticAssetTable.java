package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcImgStaticAssetTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcImgStaticAssetTable extends BaseTable<BlcImgStaticAssetRecord> {

    private RowMapper<BlcImgStaticAssetRecord> rm = RecordMapper.newInstance(BlcImgStaticAssetRecord.class);

    public BaseBlcImgStaticAssetTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcImgStaticAssetRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_IMG_STATIC_ASSET";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcImgStaticAssetRecord.class;
    }
}
