package com.pokemon.pokedex.service;

import java.util.List;

import com.pokemon.pokedex.entity.Pokemon;

public interface IPokemonService {
	
	public List<Pokemon> findAll();
	
	public Pokemon findByNombre(String nombre);

}
