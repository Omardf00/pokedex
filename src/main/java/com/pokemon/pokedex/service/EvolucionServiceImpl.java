package com.pokemon.pokedex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.pokedex.dao.IEvolucionDao;
import com.pokemon.pokedex.entity.EvolucionaDe;
import com.pokemon.pokedex.entity.Pokemon;

@Service
public class EvolucionServiceImpl implements IEvolucionService{
	
	@Autowired
	IEvolucionDao dao;

	@Override
	public EvolucionaDe findEvolutionByIdPokemon(Pokemon pokemon) {
		return dao.findByPokemonOrigen(pokemon);
	}

}
