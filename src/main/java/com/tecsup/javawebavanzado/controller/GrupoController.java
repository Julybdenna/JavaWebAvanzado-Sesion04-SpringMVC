package com.tecsup.javawebavanzado.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.javawebavanzado.modelo.Grupo;
import com.tecsup.javawebavanzado.modelo.Usuario;

@Controller
@RequestMapping("/grupo")
public class GrupoController {
	private static final Logger logger = LoggerFactory.getLogger(GrupoController.class);
	
	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView t = 
				new ModelAndView("grupo/formulario1", "grupo", new Grupo());

		return t;
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute Grupo grupo, ModelMap model) {

		model.addAttribute("codigo", grupo.getCodigo());
		model.addAttribute("nombre", grupo.getNombre());
		model.addAttribute("descripcion",grupo.getDescripcion());
		

		return "grupo/resultado1";
	}


}
