package com.book.cab.auth.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class BookCabAuthManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCabAuthManagerApplication.class, args);
	}

}
