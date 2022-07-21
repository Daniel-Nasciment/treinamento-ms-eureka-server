package br.com.alura.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		
		// O QUE É O EUREKA ?
		
		// É UM SERVIDOR ONDE OS DEMAIS MICRO SERVIÇOS IRÃO SE REGISTRAR
		
		// ISSO É UM SERVICE DISCOVERY
		
	}

}
