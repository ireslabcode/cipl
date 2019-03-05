package com.cipl.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * @author Santosh Mahto
 *
 */
@Component
public class ProjectConfiguration {
	
	
	@Bean(name = "objectWriter")
	public ObjectWriter getObjectWriter() {
		return new ObjectMapper().writerWithDefaultPrettyPrinter();
	}
	
	/*
	 * @Bean(name = "OAuth")
	 * 
	 * @ConfigurationProperties(prefix = "spring.datasource") public DataSource
	 * secondaryDataSource() { return DataSourceBuilder.create().build(); }
	 */
	
	
	/*
	 * @ConditionalOnMissingBean
	 * 
	 * @Bean(name = "OAuth")
	 * 
	 * @ConfigurationProperties(prefix = "spring.datasource") public DataSource
	 * dataSource() { DriverManagerDataSource dataSource = new
	 * DriverManagerDataSource();
	 * 
	 * dataSource.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
	 * dataSource.setUrl("jdbc:db2://192.168.1.20:50000/CCLMSDEV");
	 * dataSource.setUsername("db2inst1"); dataSource.setPassword("db@inst");
	 * //dataSource.set
	 * 
	 * return dataSource; }
	 */
	    }
