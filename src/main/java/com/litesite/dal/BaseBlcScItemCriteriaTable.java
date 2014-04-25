package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcScItemCriteriaTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScItemCriteriaTable extends BaseTable<BlcScItemCriteriaRecord> {

    private RowMapper<BlcScItemCriteriaRecord> rm = RecordMapper.newInstance(BlcScItemCriteriaRecord.class);

    public BaseBlcScItemCriteriaTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScItemCriteriaRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_ITEM_CRITERIA";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScItemCriteriaRecord.class;
    }
}
