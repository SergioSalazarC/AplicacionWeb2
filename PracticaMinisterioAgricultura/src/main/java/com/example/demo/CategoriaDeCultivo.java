package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

@Entity
public class CategoriaDeCultivo {
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	String nombre;
	@ManyToMany()
	private ArrayList<Especie> especies;
	
	public CategoriaDeCultivo(String nombre) {
		this.nombre= nombre;
		especies = new ArrayList<Especie>();
	}
	
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(ArrayList<Especie> especies) {
		this.especies = especies;
	}
	
	
}
