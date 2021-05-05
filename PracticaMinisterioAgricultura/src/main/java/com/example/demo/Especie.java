package com.example.demo;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;
@Entity
public class Especie {
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombreVulgar;
	private String nombreCientifico;
	@ManyToMany()
	private ArrayList<Plaga> plagas= new ArrayList<Plaga>();
	public Especie(long id, String nombreVulgar, String nombreCientifico, ArrayList<Plaga> plagas) {
		this.id = id;
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
	public ArrayList<Plaga> getPlagas() {
		return plagas;
	}
	public void setPlagas(ArrayList<Plaga> plagas) {
		this.plagas = plagas;
	}
	
}
