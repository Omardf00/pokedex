package com.pokemon.pokedex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokemon.pokedex.dao.IPokemonDao;
import com.pokemon.pokedex.entity.Pokemon;

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
	@Transactional(readOnly = true)
	public Pokemon findByNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

}
