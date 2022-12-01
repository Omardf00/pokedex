package com.pokemon.pokedex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.pokedex.dao.ITipoDao;
import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

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

	@Override
	public List<Pokemon> findByTipo(String nombre) {
		return dao.findByTipo(nombre);
	}


}
