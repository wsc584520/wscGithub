package cn.hpe.data;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataSourceConfiguration {
	
	@Bean(name="dataSource")
	//若有多个数据源对象，以本次创建的数据源为主
	@Primary  
	//获取application.properties配置文件中的配置项给dataSource对应的属性
	@ConfigurationProperties(prefix = "c3p0")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();		
	}

}
