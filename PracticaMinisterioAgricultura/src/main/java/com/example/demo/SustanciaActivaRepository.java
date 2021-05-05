package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SustanciaActivaRepository extends JpaRepository<SustanciaActiva,Long> {
	
	SustanciaActiva findByNombre(String Nombre);
	SustanciaActiva findById(long id);

}
