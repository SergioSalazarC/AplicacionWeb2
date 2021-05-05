package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class SustanciaActiva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	@ManyToMany
	private ArrayList<ProductoFitosanitario> productosFitosanitarios = new ArrayList<>();
	
	
	public SustanciaActiva() {
		
	}
	
	public SustanciaActiva(long id, String nombre, ArrayList<ProductoFitosanitario> productosFitosanitarios) {
		this.id = id;
		this.nombre = nombre;
		this.productosFitosanitarios = productosFitosanitarios;
	}
	
	public SustanciaActiva(String nombre, ArrayList<ProductoFitosanitario> productosFitosanitarios) {
		this.nombre = nombre;
		this.productosFitosanitarios = productosFitosanitarios;
	}
	
	public void addProductoFitosanitario(ProductoFitosanitario prod) {
		productosFitosanitarios.add(prod);
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

	public ArrayList<ProductoFitosanitario> getProductosFitosanitarios() {
		return productosFitosanitarios;
	}

	public void setProductosFitosanitarios(ArrayList<ProductoFitosanitario> productosFitosanitarios) {
		this.productosFitosanitarios = productosFitosanitarios;
	}

	
	
	
	
}
