package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Autowired
	private ProductoFitosanitarioRepository repProductosFitosanitarios;
	@Autowired
	private SustanciaActivaRepository repSustanciasActivas;
	
	
	@PostConstruct
	public void init() {
		
	}
	
	@RequestMapping("/")
	public String controller(Model model) {
		return "Main.html";
	}
}
