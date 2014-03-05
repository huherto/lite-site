package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcSkuFeeXrefTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcSkuFeeXrefTable extends BaseTable<BlcSkuFeeXrefRecord> {

    private RowMapper<BlcSkuFeeXrefRecord> rm = RecordMapper.newInstance(BlcSkuFeeXrefRecord.class);

    public BaseBlcSkuFeeXrefTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcSkuFeeXrefRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SKU_FEE_XREF";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcSkuFeeXrefRecord.class;
    }
}
