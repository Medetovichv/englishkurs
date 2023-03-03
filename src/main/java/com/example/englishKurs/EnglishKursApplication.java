package com.example.englishKurs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class EnglishKursApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishKursApplication.class, args);
	}

}