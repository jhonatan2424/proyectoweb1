package com.unu.proyectoweb1.models;

import java.util.ArrayList;
import java.util.List;

import com.unu.proyectoweb1.beans.*;

public class Autoresmodel {
	public List<Autor> listarAutores() {
		
		ArrayList<Autor>autores=new ArrayList<>();
			autores.add(new Autor(1,"Pedro Perez","Colombiano"));
			autores.add(new Autor(2,"Pedro Paucar","Chileno"));
			autores.add(new Autor(3,"Pedro Mendoza","Peruano"));
		
		return autores;
	}

}
