package com.litesite.dal;

import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

import com.github.springRecords.BaseRecord;
import com.github.springRecords.BaseTable;
import com.github.springRecords.RecordMapper;

/**
 * BaseBlcScFldMapTable –
 * Automatically generated. Do not modify or your changes might be lost.
 */
public class BaseBlcScFldMapTable extends BaseTable<BlcScFldMapRecord> {

    private RowMapper<BlcScFldMapRecord> rm = RecordMapper.newInstance(BlcScFldMapRecord.class);

    public BaseBlcScFldMapTable(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected RowMapper<BlcScFldMapRecord> rowMapper() {
        return rm;
    }

    @Override
    public String tableName() {
        return "BLC_SC_FLD_MAP";
    }

    @Override
    public Class<? extends BaseRecord> recordClass() {
        return BlcScFldMapRecord.class;
    }
}
