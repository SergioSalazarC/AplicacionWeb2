package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;

@Entity
public class Plaga {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String nombreCientifico;
	private String URL;
	@ManyToMany()
	private List<SustanciaActiva> sustancias=new ArrayList<SustanciaActiva>();
	public Plaga() {
	}
	public Plaga(long id,String nombre, String nombreCientifico, String uRL, ArrayList<SustanciaActiva> sustancias) {
		this.id =id;
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		URL = uRL;
		this.sustancias = sustancias;
	}
	
	public Plaga(String nombre, String nombreCientifico, String uRL, ArrayList<SustanciaActiva> sustancias) {
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		URL = uRL;
		this.sustancias = sustancias;
	}
	
	public Plaga(String nombre, String nombreCientifico, String uRL) {
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		URL = uRL;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public List<SustanciaActiva> getSustancias() {
		return sustancias;
	}
	public void setSustancias(ArrayList<SustanciaActiva> sustancias) {
		this.sustancias = sustancias;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void addSustancia(SustanciaActiva s) {
		this.sustancias.add(s);
	}
	
}