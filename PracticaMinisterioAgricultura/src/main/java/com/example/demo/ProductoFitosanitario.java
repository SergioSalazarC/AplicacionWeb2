package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductoFitosanitario {
	//Esta es la clase Producto Fitosanitario, son su constructores y sus setters y getters
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String url;
	
	
	public ProductoFitosanitario() {
		
	}
	
	public ProductoFitosanitario(String nombre, String url) {
		this.nombre = nombre;
		this.url = url;
	}
	
	public ProductoFitosanitario(long id, String nombre, String url) {
		this.id = id;
		this.nombre = nombre;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

}
