package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDeCultivoRepository extends JpaRepository<CategoriaDeCultivo, Long>{
	CategoriaDeCultivo findById(long id);
	List<CategoriaDeCultivo> findByNombre(String nombre);
	List<CategoriaDeCultivo> findByEspecies(Especie especie);
	List<CategoriaDeCultivo> findByEspeciesId(Long id);
}
