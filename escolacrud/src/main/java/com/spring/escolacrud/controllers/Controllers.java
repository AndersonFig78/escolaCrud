package com.spring.escolacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.escolacrud.models.Aluno;
import com.spring.escolacrud.models.Professor;
import com.spring.escolacrud.repository.EscolaSystemRepository;
import com.spring.escolacrud.repository.RepositoryProfessor;

@Controller
public class Controllers {

	@Autowired
	private EscolaSystemRepository esr; 
	@Autowired
	private RepositoryProfessor esrp; 
	
	@RequestMapping("/index")
public String index() {
	return "/index";
}

	@RequestMapping(value="/cadastrar-aluno", method = RequestMethod.GET)
	public String cadastrarAluno() {
		return "/cadastrar-aluno";
	}
	
	@RequestMapping(value="/cadastrar-aluno", method = RequestMethod.POST)
	public String cadastrarAluno(Aluno aluno) {
		esr.save(aluno);
		return "redirect:/index";
	}
	
	@RequestMapping(value="/cadastrar-professor", method = RequestMethod.GET)
	public String cadastrarProfessor() {
		return "/cadastrar-professor";
	}
	
	@RequestMapping(value="/cadastrar-professor", method = RequestMethod.POST)
	public String cadastrarProfessor(Professor professor) {
		esrp.save(professor);
		return "redirect:/index";
	}
}
