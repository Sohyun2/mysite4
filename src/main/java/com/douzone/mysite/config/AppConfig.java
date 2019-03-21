package com.douzone.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.config.app.DBConfig;
import com.douzone.config.app.MyBatisConfig;

@Configuration
@ComponentScan(value= {"com.douzone.mysite.repository", "com.douzone.mysite.service"})
@Import(value= {DBConfig.class, MyBatisConfig.class})
public class AppConfig {
	
}
