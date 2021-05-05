package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoFitosanitarioRepository extends JpaRepository<ProductoFitosanitario,Long> {
	
	ProductoFitosanitario findByNombre(String nombre);
	ProductoFitosanitario findByUrl(String url);
	ProductoFitosanitario findById(long id);
}
