package ar.edu.unq.desapp.grupoXXX.backenddesappapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.desapp.grupoXXX.backenddesappapi.model.Car;
import ar.edu.unq.desapp.grupoXXX.backenddesappapi.repositories.CarRepository;



@Service
public class CarService  {

	@Autowired
	private CarRepository  repository;
	
	@Transactional
	public Car save(Car model) {
		return this.repository.save(model);
	}

	public Car findByID(Integer id) {
		return this.repository.findById(id).get();
	}

	public List<Car> findAll() {
		return this.repository.findAll();
	}
}