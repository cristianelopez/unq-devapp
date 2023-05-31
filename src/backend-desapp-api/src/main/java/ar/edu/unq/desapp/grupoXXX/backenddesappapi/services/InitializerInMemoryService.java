package ar.edu.unq.desapp.grupoXXX.backenddesappapi.services;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.desapp.grupoXXX.backenddesappapi.model.Car;
import ar.edu.unq.desapp.grupoXXX.backenddesappapi.webservices.CarController;

@Service
@Transactional
public class InitializerInMemoryService {

	static Logger logger = LoggerFactory.getLogger(CarController.class);

	@Value("${spring.datasource.driverClassName}")
	private String className;
	
	@Autowired
	private CarService carService;

	@PostConstruct
	public void initialize() {
		if (className.equals("org.h2.Driver")) {
			logger.warn("Init Data Using H2 DB");
			fireInitialData();
		}
	}

	@Transactional
	private void fireInitialData() {
		Car car = new Car(1, "PNA 879", "Renault Clio");
		Car car2 = new Car(2, "PNA 880", "Renault Clio");
		Car car3 = new Car(3, "PNA 881", "Renault Clio");
		
		carService.save(car);
		carService.save(car2);
		carService.save(car3);
	}
}
