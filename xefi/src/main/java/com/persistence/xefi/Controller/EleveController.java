package com.persistence.xefi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistence.xefi.Models.*;

import com.persistence.xefi.Service.IEleveService;

@RestController

@RequestMapping("/eleve")
public class EleveController {
	
	//injection des dépendence
	
	private IEleveService iService;

	@Autowired
	public EleveController(IEleveService _IEleveService) {
		super();
		this.iService = _IEleveService;
	}
	
	@GetMapping("/read")
	public List<Eleve> readAll(){
		return iService.lireAll();
	}
	
	@GetMapping("/read/id")
	public Optional<Eleve> lireById(Long id) {
		return iService.lireById(id);
	}
	
	@PostMapping("/create")
	public Eleve create(@RequestBody Eleve eleve) {
		return iService.creer(eleve);
	}
	
	@PutMapping("/update/id")
	public Eleve update(@PathVariable Long id, @RequestBody Eleve eleve) {
		return iService.modifier(id, eleve);
	}
	
	@DeleteMapping("/delete")
	public String delete(@PathVariable Long id) {
		return iService.supprimer(id);
	}
}


/*
 	List<Eleve> lireAll();
	
	Optional<Eleve> lireById(Long id);
	
	Eleve creer(Eleve livre);
	
	Eleve modifier(Long id, Eleve eleve);
	
	String supprimer(Long id);
*/