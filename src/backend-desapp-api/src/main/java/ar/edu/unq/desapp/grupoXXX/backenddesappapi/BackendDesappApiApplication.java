package ar.edu.unq.desapp.grupoXXX.backenddesappapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BackendDesappApiApplication {

	public static void main(String[] args) {
	//    System.setProperty("server.servlet.context-path", "/unq");
		SpringApplication.run(BackendDesappApiApplication.class, args);
	}

}
