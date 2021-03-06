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

import com.tecsup.javawebavanzado.modelo.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	
	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView t = 
				new ModelAndView("usuario/formulario", "usuario", new Usuario());

		return t;
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute Usuario usuario, ModelMap model) {

		model.addAttribute("cuenta", usuario.getCuenta());
		model.addAttribute("clave", usuario.getClave());
		model.addAttribute("direccion", usuario.getDireccion());
		model.addAttribute("referencia",usuario.getReferencia());

		return "usuario/resultado";
	}

}