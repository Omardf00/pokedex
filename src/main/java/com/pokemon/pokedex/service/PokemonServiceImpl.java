package com.pokemon.pokedex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.pokedex.dao.IPokemonDao;
import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

@Service
public class PokemonServiceImpl implements IPokemonService{
	
	@Autowired
	IPokemonDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Pokemon> findAll() {
		return (List<Pokemon>) dao.findAll();
	}

	@Override
	public List<Pokemon> findByTipos(Tipo tipo) {
		return dao.findByTipos(tipo);
	}

	@Override
	public Pokemon findByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

}
