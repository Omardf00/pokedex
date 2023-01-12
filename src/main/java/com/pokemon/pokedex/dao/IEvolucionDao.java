package com.pokemon.pokedex.dao;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.pokedex.entity.EvolucionaDe;

public interface IEvolucionDao extends CrudRepository<EvolucionaDe, Integer>{
	
	public EvolucionaDe findById(int idPokemon);
	
}
