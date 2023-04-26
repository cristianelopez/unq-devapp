package ar.edu.unq.desapp.grupoXXX.backenddesappapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

	@Id
	private Integer id;

	@Column
	private String carPatent;

	@Column
	private String model;

	public Car() {
		super();
	}

	public Car(Integer id, String carPatent, String model) {
		super();
		this.id = id;
		this.carPatent = carPatent;
		this.model = model;
	}

}