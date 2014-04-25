package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import io.github.huherto.springyRecords.BaseRecord;
import io.github.huherto.springyRecords.BaseTable;
import io.github.huherto.springyRecords.RecordMapper;

/**
 * BaseBlcPageFldMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcPageFldMapTable extends BaseTable<BlcPageFldMapRecord> {

    private RowMapper<BlcPageFldMapRecord> rm = RecordMapper.newInstance(BlcPageFldMapRecord.class);

    public BaseBlcPageFldMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcPageFldMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_PAGE_FLD_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcPageFldMapRecord.class;
    }
}
