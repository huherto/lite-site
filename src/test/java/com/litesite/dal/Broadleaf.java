package com.litesite.dal;

import io.github.huherto.springyRecords.generator.DataBaseGenerator;

import org.apache.commons.dbcp.BasicDataSource;
import org.hsqldb.jdbc.JDBCDriver;
import org.junit.Test;

public class Broadleaf {

	@Test
	public void generate() {

		BasicDataSource ds = new BasicDataSource();

		ds.setUrl("jdbc:hsqldb:hsql://localhost/broadleaf");
		ds.setUsername("sa");
		ds.setPassword("");
		ds.setDriverClassName(JDBCDriver.class.getName());

		String packageName = "com.litesite.dal";
		DataBaseGenerator dbgenerator = new DataBaseGenerator(ds, packageName);
		dbgenerator.printInformationSchema();

		dbgenerator.processAllTables("PUBLIC.PUBLIC");

	}

}
