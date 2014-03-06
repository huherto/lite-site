package com.litesite.dal;

import org.apache.commons.dbcp.BasicDataSource;
import org.hsqldb.jdbc.JDBCDriver;
import org.junit.Test;

import com.github.springRecords.generator.DataBaseGenerator;

public class Broadleaf {

	@Test
	public void generate() {

		BasicDataSource ds = new BasicDataSource();

		ds.setUrl("jdbc:hsqldb:hsql://localhost/broadleaf");
		ds.setUsername("sa");
		ds.setPassword("");
		ds.setDriverClassName(JDBCDriver.class.getName());
		DataBaseGenerator dbgenerator = new DataBaseGenerator(ds, "PUBLIC", "PUBLIC", "com.litesite.dal");
		dbgenerator.printInformationSchema();
		//dbgenerator.processAllTables();

	}

}
