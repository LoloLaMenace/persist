package com.persistence.xefi.Service;

import java.util.*;

import com.persistence.xefi.Models.Eleve;
public interface IEleveService {

	List<Eleve> lireAll();
	
	Optional<Eleve> lireById(Long id);
	
	Eleve creer(Eleve livre);
	
	Eleve modifier(Long id, Eleve eleve);
	
	String supprimer(Long id);
}
