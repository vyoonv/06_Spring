package edu.kh.todo.common.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


/* @configuration 
 * - 설정용 클래스임을 명시 
 * + 객체로 생성해서 내부 코드를 서버 실행시 모두 수행 
 * 
 * @PropertySource("경로") 
 * - 지정된 경로의 properties 파일 내용을 읽어와 사용 
 * - 사용할 properties 파일이 다수일 경우 
 *   해당 어노테이션을 연속해서 작성하면 됨 
 * 
 *   @ConfigurationProperties(prefix="spring.datasource.hikari")  
 *   -@PropertySource 로 읽어온 properties 파일의 내용 중 접두사 (앞부분, prefix)가 일치하는 값만 읽어옴 
 *   
 * 	@Bean
 * 	- 개발자가 수동으로 생성한 객체의 관리를 
 *    스프링에게 넘기는 어노테이션 (Bean 등록) 
 * */



@Configuration
@PropertySource("classpath:/config.properties")
public class DBConfig {
	
	
	//////////////// Hikari CP 설정 ////////////////////
		
	@Bean
	@ConfigurationProperties(prefix="spring.datasource.hikari")  
	public HikariConfig hikariConfig() {
	
		return new HikariConfig(); 
		
	}
	
	
	
public DataSource dataSource(HikariConfig config) {
	// 매개변수 HikariConfig config
	//-> 등록된 Bean 중 HikariConfig 타입의 Bean 자동으로 주입 
	
	DataSource dataSource = new HikariDataSource(config); 
	
	return dataSource; 
	
}
	
	
	

}
