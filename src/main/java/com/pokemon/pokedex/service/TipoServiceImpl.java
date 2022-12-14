package com.pokemon.pokedex.service;

import com.pokemon.pokedex.dao.ITipoDao;
import com.pokemon.pokedex.entity.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoServiceImpl implements ITipoService {
	
	@Autowired
	ITipoDao dao;

	@Override
	public List<Tipo> findAll() {
		return (List<Tipo>) dao.findAll();
	}

	@Override
	public Tipo findByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}


}
