package com.example.demo;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
public interface  PlagaRepository extends JpaRepository<Plaga, Long> {
	Plaga findByNombre(String nombre);
	Plaga findByNombreCientifico(String nombreCientifico);
	Plaga findByURL(String URL);
	Plaga findById(long id);
	
}
