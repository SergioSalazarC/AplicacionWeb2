package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Autowired
	private CategoriaDeCultivoRepository repCategoriaDeCultivoRepository;
	@Autowired
	private ProductoFitosanitarioRepository repProductosFitosanitarios;
	@Autowired
	private SustanciaActivaRepository repSustanciasActivas;
	
	
	@PostConstruct
	public void init() {
		List<CategoriaDeCultivo>categorias = new ArrayList();
		categorias.add(new CategoriaDeCultivo("hortalizas"));
		categorias.add(new CategoriaDeCultivo("arboles frutales"));
		categorias.add(new CategoriaDeCultivo("plantas ornamentales"));
		categorias.add(new CategoriaDeCultivo("leguminosas"));
		
		List<Especie> especies = new ArrayList();
		especies.add(new Especie("Tomate", "Solanum lycopersicum"));
		especies.add(new Especie("Pepino", "Cucurbita pepo"));
		especies.add(new Especie("Naranja", "Citrus maxima"));
		especies.add(new Especie("Camelia", "Camelia oleifera"));
		especies.add(new Especie("Amapola", "Papaver rhoeas"));
		especies.add(new Especie("Garbanzo", "Cicer ariethum"));
		especies.add(new Especie("Patata", "Solanum Tuberosum"));
		especies.add(new Especie("Judia", "Thaseolus vulgaris"));
		
		categorias.get(0).addEspecie(especies.get(0));
		categorias.get(1).addEspecie(especies.get(0));
		categorias.get(0).addEspecie(especies.get(1));
		categorias.get(1).addEspecie(especies.get(2));
		categorias.get(2).addEspecie(especies.get(3));
		categorias.get(2).addEspecie(especies.get(4));
		categorias.get(3).addEspecie(especies.get(5));
		categorias.get(0).addEspecie(especies.get(6));
		categorias.get(3).addEspecie(especies.get(7));
		
		
	}
	
	@RequestMapping("/")
	public String controller(Model model) {
		return "Main.html";
	}
}
