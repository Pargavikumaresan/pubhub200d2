package com.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	public static DataSource getDataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
		dataSource.setUrl("jdbc:mysql:loadbalance://localhost:3306/bookdb");
		dataSource.setUsername("root");
		dataSource.setPassword("tiger");
		return dataSource;
	}
}
