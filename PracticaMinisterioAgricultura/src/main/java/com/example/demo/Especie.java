package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;
@Entity
public class Especie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombreVulgar;
	private String nombreCientifico;
	@ManyToMany
	private List<Plaga> plagas;
	
	public Especie(String nombreVulgar, String nombreCientifico) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.plagas = new ArrayList<Plaga>();
	}
	
	private Especie(long id, String nombreVulgar, String nombreCientifico) {
		this.id = id;
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.plagas = new ArrayList<Plaga>();
	}
	
	public Especie(String nombreVulgar, String nombreCientifico, List<Plaga> plagas) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.plagas = plagas;
	}
	public Especie() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public List<Plaga> getPlagas() {
		return plagas;
	}
	public void setPlagas(ArrayList<Plaga> plagas) {
		this.plagas = plagas;
	}
	public void addPlaga(Plaga p) {
		this.plagas.add(p);
	}
	
	public Especie copiaSinLista() {
		return(new Especie(this.id, this.nombreVulgar, this.nombreCientifico));
	}
	
	
	
}
