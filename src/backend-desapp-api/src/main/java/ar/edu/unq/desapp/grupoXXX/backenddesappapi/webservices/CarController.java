package ar.edu.unq.desapp.grupoXXX.backenddesappapi.webservices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unq.desapp.grupoXXX.backenddesappapi.model.Car;

import ar.edu.unq.desapp.grupoXXX.backenddesappapi.services.CarService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/car")
public class CarController {

	static Logger logger = LoggerFactory.getLogger(CarController.class);

	
    @Autowired
    private CarService carService;
    
  
    @GetMapping("/all")
    public ResponseEntity<List<Car>> allCars() {
    	// starttime
        List<Car> list = carService.findAll();
        logger.info(list.toString());
        return ResponseEntity.ok().body(list);
    }
        
    
    @RequestMapping(value = "/version", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getVersion() {
    	String version = "0.2.1";
		Map<String, String> resultado = new HashMap<String, String>();
		resultado.put("version", version);
		 logger.info(resultado.toString());
		return ResponseEntity.ok().body(resultado);
	}
   
}