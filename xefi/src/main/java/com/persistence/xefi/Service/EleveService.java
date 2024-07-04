package com.persistence.xefi.Service;

import java.util.List;
import java.util.Optional;

import com.persistence.xefi.Models.Eleve;
import com.persistence.xefi.Repository.IEleveRepository;

public class EleveService implements IEleveService {
	
	//injection des déoendences
	private IEleveRepository _irepo;
	
	//injection via le constructeur
	public EleveService(IEleveRepository _irepo) {
		super();
		this._irepo = _irepo;
	}
	

	@Override
	public List<Eleve> lireAll() {
		
		return null;
	}

	@Override
	public Optional<Eleve> lireById(Long id) {

		return Optional.empty();
	}

	@Override
	public Eleve creer(Eleve livre) {

		return null;
	}

	@Override
	public Eleve modifier(Long id, Eleve eleve) {

		return null;
	}

	@Override
	public String supprimer(Long id) {

		return null;
	}

}
