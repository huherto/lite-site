package com.litesite.dal;

import javax.sql.DataSource;

public class Database extends BaseDatabase {

	protected Database(DataSource dataSource) {
		super(dataSource);
	}

}
