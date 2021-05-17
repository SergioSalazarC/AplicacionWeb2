package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface  PlagaRepository extends JpaRepository<Plaga, Long> {
	Plaga findByNombre(String nombre);
	Plaga findByNombreCientifico(String nombreCientifico);
	Plaga findByUrl(String url);
	Plaga findById(long id);
	
}
