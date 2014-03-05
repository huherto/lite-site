package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcOrderMultishipOptionTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcOrderMultishipOptionTable extends BaseTable<BlcOrderMultishipOptionRecord> {

    private RowMapper<BlcOrderMultishipOptionRecord> rm = RecordMapper.newInstance(BlcOrderMultishipOptionRecord.class);

    public BaseBlcOrderMultishipOptionTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcOrderMultishipOptionRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_ORDER_MULTISHIP_OPTION";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcOrderMultishipOptionRecord.class;
    }
}
