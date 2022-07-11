package com.example.obspringdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {
	
	//Atributos encapsulados
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String manofacturer;
	private String model;
	private Integer year;
	
	//constructores
	public Coche() {
		
	}
	public Coche(Long id, String manofacture, String model, Integer year) {
		this.id = id;
		this.manofacturer = manofacture;
		this.model = model;
		this.year = year;
	}
	
	
	//getter y setter (metodos)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManofacturer() {
		return manofacturer;
	}
	public void setManofacturer(String manofacturer) {
		this.manofacturer = manofacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	

	
	//tostring
	@Override
	public String toString() {
		return "Coche ["
				+ "id=" + id +
				", manofacturer=" + manofacturer + 
				", model=" + model + 
				", year=" + year + "]";
	}

}
