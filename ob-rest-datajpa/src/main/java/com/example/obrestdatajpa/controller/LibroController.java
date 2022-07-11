package com.example.obrestdatajpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.obrestdatajpa.entiti.Libros;
import com.example.obrestdatajpa.repository.LibrosRepository;

@RestController
public class LibroController {
	
	//atributos
	private LibrosRepository librosRepository;
	
	//constructor
	public LibroController(LibrosRepository librosRepository) {
		this.librosRepository = librosRepository;
	
	}
	//CRUD sobre la entidad Libros
	
	//Buscar todos los libros
	@GetMapping("/api/libros")
	public List<Libros> findAll() {
		
		//recurar y devolver de la BBDD
		return librosRepository.findAll();
		
	}

	
	
	//Buscar un solo  libro en base de datos según su Id
	
	//Crear un nuevo libro en BBDD
	
	//Actualizar un libro existente en BBDD
	
	//Borrar un libro en base de datos

}
