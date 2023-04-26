package ar.edu.unq.desapp.grupoXXX.backenddesappapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unq.desapp.grupoXXX.backenddesappapi.model.Car;


@Configuration
@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

	Optional<Car> findById(Integer id);
	
	List<Car> findAll();

}
