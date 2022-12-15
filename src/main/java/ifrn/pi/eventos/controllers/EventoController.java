package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/eventos/formulario")
	public String formulario() {
		return "formularioEvento";
	}
}
