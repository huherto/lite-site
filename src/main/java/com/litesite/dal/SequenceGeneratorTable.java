package com.litesite.dal;

import javax.sql.DataSource;

/**
 * SequenceGeneratorTable –
 *
 */
public class SequenceGeneratorTable extends BaseSequenceGeneratorTable {
    public SequenceGeneratorTable(DataSource dataSource) {
        super(dataSource);
    }
}
