package it.newsoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.newsoft.model.Libro;
import it.newsoft.service.LibroService;

@Controller
public class LibroController {
	
	@Autowired
	LibroService libroService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/showLibri", method = RequestMethod.GET)
	@ResponseBody
	public List<Libro> getClienti(HttpServletRequest request) {
		return libroService.listAll();
	}

}
