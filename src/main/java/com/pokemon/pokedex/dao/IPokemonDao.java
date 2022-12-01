package com.pokemon.pokedex.dao;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.pokedex.entity.Pokemon;

public interface IPokemonDao extends CrudRepository<Pokemon, Integer>{
	
	public Pokemon findByNombre(String nombre);

}
