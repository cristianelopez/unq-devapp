package ar.edu.unq.desapp.grupoXXX.backenddesappapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;




@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@OpenAPIDefinition(info = @Info(title = "Ejemplo con Swagger3 (OpenAPI) ", version = "1.0", description = "Universidad Nacional de Quilmes - Desarrollo de aplicaciones"))
public class BackendDesappApiApplication {

	public static void main(String[] args) {
	//    System.setProperty("server.servlet.context-path", "/unq");
		SpringApplication.run(BackendDesappApiApplication.class, args);
	}

}
