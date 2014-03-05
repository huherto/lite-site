package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcPageItemCriteriaTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageItemCriteriaTable extends BaseTable<BlcPageItemCriteriaRecord> {

    private RowMapper<BlcPageItemCriteriaRecord> rm = RecordMapper.newInstance(BlcPageItemCriteriaRecord.class);

    public BaseBlcPageItemCriteriaTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageItemCriteriaRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE_ITEM_CRITERIA";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageItemCriteriaRecord.class;
    }
}
