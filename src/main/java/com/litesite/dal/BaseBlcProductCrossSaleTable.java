package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcProductCrossSaleTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcProductCrossSaleTable extends BaseTable<BlcProductCrossSaleRecord> {

    private RowMapper<BlcProductCrossSaleRecord> rm = RecordMapper.newInstance(BlcProductCrossSaleRecord.class);

    public BaseBlcProductCrossSaleTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcProductCrossSaleRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PRODUCT_CROSS_SALE";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcProductCrossSaleRecord.class;
    }
}
