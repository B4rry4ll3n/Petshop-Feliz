package br.com.petshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.petshop.repository.ContatoRepositorio;


@RestController
@RequestMapping({"/contatos"})
public class ContactController {
	
	private ContatoRepositorio repositorio;
	
	
	public ContactController(ContatoRepositorio contatoRepositorio) {
		this.repositorio = contatoRepositorio;
		}
	
	@GetMapping
	public List

}
