package com.example.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//#####[ 서비스, 컨트롤러, 환경설정 ]#######

// basePackages 지정된 패키지포함 하위패키지까지 적용
// 하위옵션생략하면 기본패키지 탐색한다.
@ComponentScan(basePackages = {
	"com.example.mvc", 
	"controller"
})

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
