package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EventoController {
	
	@RequestMapping("/eventos/formulario")
	public String formulario() {
		return "formularioEvento";
	}
	
	@RequestMapping(path = "/eventos", method = RequestMethod.POST)
	public String adicionar(){
		return "evento-adicionado";
	}
}
