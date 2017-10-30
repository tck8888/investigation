package com.ctk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tck.mapper")
public class InvestigationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestigationApplication.class, args);
	}
}
