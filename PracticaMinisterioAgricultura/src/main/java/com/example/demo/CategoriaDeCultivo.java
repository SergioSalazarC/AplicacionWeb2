package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class CategoriaDeCultivo {
	//Esta es la clase Categoría de cultivo, son su constructores y sus setters y getters
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	String nombre;
	@ManyToMany()
	private List<Especie> especies;
	
	
	public CategoriaDeCultivo() {
		especies = new ArrayList<Especie>();
	}
	public CategoriaDeCultivo(String nombre) {
		this.nombre= nombre;
		especies = new ArrayList<Especie>();
	}
	//Constructor usado para el método copia sin lista.
	private CategoriaDeCultivo(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	public List<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(ArrayList<Especie> especies) {
		this.especies = especies;
	}
	//Añade una especie a su lista.
	public void addEspecie(Especie especie) {
		especies.add(especie);
	}
	//Método para copiar el objeto sin la lista.
	public CategoriaDeCultivo copiaSinLista() {
		return(new CategoriaDeCultivo(this.id, this.nombre));
	}
	
	
}
