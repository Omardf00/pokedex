package com.pokemon.pokedex.dao;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.pokedex.entity.EvolucionaDe;
import com.pokemon.pokedex.entity.Pokemon;

public interface IEvolucionDao extends CrudRepository<EvolucionaDe, Integer>{
	
	public EvolucionaDe findByPokemonOrigen(Pokemon pokemon);
	
}
