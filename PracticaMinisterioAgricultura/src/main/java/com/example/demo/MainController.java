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
		
		List<Plaga> plagas = new ArrayList();
		plagas.add(new Plaga("Mosca Blanca","Aleyrodidae","https://es.wikipedia.org/wiki/Aleyrodidae"));
		plagas.add(new Plaga("Pulgón","Alphididae","https://es.wikipedia.org/wiki/Aphididae"));
		plagas.add(new Plaga("Araña Roja","Tetranychus urticae","https://es.wikipedia.org/wiki/Tetranychus_urticae"));
		plagas.add(new Plaga("Tisanóptero","Thysanoptera","https://es.wikipedia.org/wiki/Thysanoptera"));
		plagas.add(new Plaga("Oruga","Papilio machaon","https://es.wikipedia.org/wiki/Oruga_(larva)"));
		plagas.add(new Plaga("Saltamontes","Caelifera","https://es.wikipedia.org/wiki/Caelifera"));
		plagas.add(new Plaga("Escarabajo","Coleoptera","https://es.wikipedia.org/wiki/Coleoptera"));
		plagas.add(new Plaga("Insecto Escama","Coccoidea","https://es.wikipedia.org/wiki/Coccoidea"));
		plagas.add(new Plaga("Babosas","Stylommatophora","https://es.wikipedia.org/wiki/Babosa"));
		plagas.add(new Plaga("Hormigas","Formicidae","https://es.wikipedia.org/wiki/Formicidae"));
		plagas.add(new Plaga("Lombriz de tierra","Lumbricidae","https://es.wikipedia.org/wiki/Lumbricidae"));
		plagas.add(new Plaga("Topos","Talpidae","https://es.wikipedia.org/wiki/Talpidae"));
		plagas.add(new Plaga("Gusano Redondo","Nematodos","https://es.wikipedia.org/wiki/Nematoda"));
		plagas.add(new Plaga("Cochinillas de la humedad","Oniscidea","https://es.wikipedia.org/wiki/Oniscidea"));
		plagas.add(new Plaga("Cochinilla del carmín","Dactylopius coccus","https://es.wikipedia.org/wiki/Dactylopius_coccus"));
		plagas.add(new Plaga("Cochinilla harinosa","Pseudococcidae","https://es.wikipedia.org/wiki/Pseudococcidae"));
		
		especies.get(0).addPlaga(plagas.get(0));
		especies.get(1).addPlaga(plagas.get(1));
		especies.get(2).addPlaga(plagas.get(2));
		especies.get(3).addPlaga(plagas.get(3));
		especies.get(4).addPlaga(plagas.get(4));
		especies.get(5).addPlaga(plagas.get(5));
		especies.get(6).addPlaga(plagas.get(5));
		especies.get(6).addPlaga(plagas.get(6));
		especies.get(7).addPlaga(plagas.get(7));
		especies.get(0).addPlaga(plagas.get(8));
		especies.get(1).addPlaga(plagas.get(8));
		especies.get(1).addPlaga(plagas.get(9));
		especies.get(2).addPlaga(plagas.get(10));
		especies.get(3).addPlaga(plagas.get(11));
		especies.get(4).addPlaga(plagas.get(12));
		especies.get(5).addPlaga(plagas.get(13));
		especies.get(6).addPlaga(plagas.get(14));
		especies.get(6).addPlaga(plagas.get(15));
		especies.get(5).addPlaga(plagas.get(15));
		especies.get(5).addPlaga(plagas.get(14));
		
		
		
		
		
		
		
	}
	
	@RequestMapping("/")
	public String controller(Model model) {
		return "Main.html";
	}
}
