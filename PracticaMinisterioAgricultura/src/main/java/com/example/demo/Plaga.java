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
	private String url;
	@ManyToMany()
	private List<SustanciaActiva> sustancias;
	public Plaga() {
	}
	public Plaga(String nombre, String nombreCientifico, String uRL, ArrayList<SustanciaActiva> sustancias) {
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		url = uRL;
		this.sustancias = sustancias;
	}
	
	public Plaga(String nombre, String nombreCientifico, String url) {
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		this.url = url;
		this.sustancias = new ArrayList<SustanciaActiva>();
	}
	
	private Plaga(long id, String nombre, String nombreCientifico, String url) {
		this.id = id;
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		this.url = url;
		this.sustancias = new ArrayList<SustanciaActiva>();
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
		return url;
	}
	public void setURL(String uRL) {
		url = uRL;
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
	public Plaga copiaSinLista() {
		return(new Plaga(this.id, this.nombre, this.nombreCientifico, this.url));
	}
	
}