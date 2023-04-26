package com.projeto.spring.curso.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.spring.curso.domain.Sala;
import com.projeto.spring.curso.repository.SalaRepository;

@RestController
public class SalaController {
	
	@Autowired
	private SalaRepository sl;
	
	@GetMapping("/sala/listar")
	public List<Sala> listar() {
		return sl.findAll();
	}
	
	@PostMapping("/sala/listar/{id}")
	public Optional <Sala>listar(@PathVariable Long id) {
		return sl.findById(id);
	}
	
	@PostMapping("/sala/cadastrar")
	public String cadastrar(@RequestBody Sala sala) {
		
		sl.save(sala);
		return "Sala cadastrada com sucesso!";
	}
	
	@PutMapping("/sala/atualizar/{id}")
	public String atualizar (@PathVariable Long id, @RequestBody Sala sala) {
		String msg = "";
		
		Optional<Sala> s = sl.findById(id);
		
		if(s.isPresent()) {
			sala.setIdsala(id);
			sl.save(sala);
			msg = "Sala atualizada!";
		}
		else {
			msg = "Curso não encontrado!";
		}
		return msg;
	}
	
	@DeleteMapping("/sala/apagar/{id}")
	public String apagar (@PathVariable Long id) {
		String msg = "";
		Optional <Sala> s= sl.findById(id);
		
		if (s.isPresent()) {	
			sl.deleteById(id);
			msg = "Sala apagada com sucesso!";
		}
		else {
			msg = "Sala não encontrada!";
		}
		return msg;
	}

}
