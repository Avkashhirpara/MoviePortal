package com.movie.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviePortalApplication.class, args);
	}

//	@Bean
//	public DataSource mysqlDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
//		dataSource.setUsername("guest_user");
//		dataSource.setPassword("guest_password");
//
//		return dataSource;
//	}

}
