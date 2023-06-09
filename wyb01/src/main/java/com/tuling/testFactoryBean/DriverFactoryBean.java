package com.tuling.testFactoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;

public class DriverFactoryBean implements FactoryBean<Object> {

	private String jdbcUrl;

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	@Override
	public Object getObject() throws Exception {
		return DriverManager.getDriver(jdbcUrl);
	}

	@Override
	public Class<?> getObjectType() {
		return java.sql.Driver.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
