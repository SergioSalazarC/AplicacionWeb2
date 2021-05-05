package com.example.demo;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;

@Entity
public class Plaga {
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String nombreCientifico;
	private String URL;
	@ManyToMany()
	private ArrayList<SustanciaActiva> sustancias=new ArrayList<SustanciaActiva>();
	public Plaga() {
	}
	public Plaga(long id,String nombre, String nombreCientifico, String uRL, ArrayList<SustanciaActiva> sustancias) {
		this.id =id;
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		URL = uRL;
		this.sustancias = sustancias;
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
	public ArrayList<SustanciaActiva> getSustancias() {
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
	
}