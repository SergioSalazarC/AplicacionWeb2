package com.example.demo;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EspecieRepository extends JpaRepository<Especie, Long> {
	Especie findByNombreVulgar(String nombreVulgar);
	Especie findByNombreCientifico(String nombreCientifico);
	Especie findById(long id);
	
}
