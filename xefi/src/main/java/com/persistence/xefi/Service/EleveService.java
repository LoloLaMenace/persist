package com.persistence.xefi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.xefi.Models.Eleve;
import com.persistence.xefi.Repository.IEleveRepository;

@Service
public class EleveService implements IEleveService {
	
	//injection des déoendences
	private IEleveRepository _irepo;
	
	//injection via le constructeur
	@Autowired
	public EleveService(IEleveRepository _irepo) {
		super();
		this._irepo = _irepo;
	}
	

	@Override
	public List<Eleve> lireAll() {
		return _irepo.findAll();
	}

	@Override
	public Optional<Eleve> lireById(Long id) {
		return _irepo.findById(id);
	}

	@Override
	public Eleve creer(Eleve eleve) {

		return _irepo.save(eleve);
	}

	@Override
	public Eleve modifier(Long id, Eleve eleve) {

		return _irepo.findById(id)
				.map(E -> {
					E.setNom(eleve.getNom());
					E.setPrenom(eleve.getPrenom());
					return _irepo.save(E);
				}).orElseThrow(()-> new RuntimeException("Eleve non trouvé !"));
	}

	@Override
	public String supprimer(Long id) {
		_irepo.deleteById(id);
		return "suppression ok";
	}

}
