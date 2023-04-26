package ar.edu.unq.desapp.grupoXXX.backenddesappapi.services;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.desapp.grupoXXX.backenddesappapi.model.Car;

@Service
@Transactional
public class InitServiceInMemory {

	protected final Log logger = LogFactory.getLog(getClass());

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

	private void fireInitialData() {
		Car car = new Car(1, "PNA 879", "Renault Clio");
		Car car2 = new Car(2, "PNA 880", "Renault Clio");
		Car car3 = new Car(3, "PNA 881", "Renault Clio");
		carService.save(car);
		carService.save(car2);
		carService.save(car3);
	}
}
