package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext contex = SpringApplication.run(ObSpringdatajpaApplication.class, args);
		
		CocheRepository repository = contex.getBean(CocheRepository.class);
		
		System.out.println("find");
		System.out.println("El numero de coches en la base de datos es: " + repository.count());
		
		//crear y almacenar un coche en la base de datos
		Coche toyota = new Coche(null,"Toyota", "Prius", 2010);
		repository.save(toyota);
		Coche peugeot = new Coche(null, "Peugeot", "308 sw", 2012);
		repository.save(peugeot);
		
		//recuperar un coche por id
		
		System.out.println(repository.findAll());
	}

}
