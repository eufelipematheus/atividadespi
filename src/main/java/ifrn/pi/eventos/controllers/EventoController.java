package ifrn.pi.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoRepository;


@Controller
@RequestMapping("/eventos")
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping("/eventos/formulario")
	public String formulario() {
		return "formularioEvento";
	}
	
	@PostMapping
	public String adicionar(Evento evento){
		
		System.out.println(evento);
		er.save(evento);
		return "eventos/evento-adicionado";
	}
	
	@GetMapping
	public ModelAndView listar() {
		List<Evento> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("evento/lista");
		mv.addObject("eventos", eventos);
		return mv;
	}
	
}
