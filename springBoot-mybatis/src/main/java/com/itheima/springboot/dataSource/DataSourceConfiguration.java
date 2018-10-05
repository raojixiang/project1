package com.itheima.springboot.dataSource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration   //定义配置信息类
public class DataSourceConfiguration {

	@Bean
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.c3p0")
	public DataSource getDataSource(){
			return DataSourceBuilder.create()
				.type(ComboPooledDataSource.class).build();
		
	}
	
	
}
