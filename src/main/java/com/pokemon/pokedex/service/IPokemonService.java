package com.pokemon.pokedex.service;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

import java.util.List;

public interface IPokemonService {
	
	public List<Pokemon> findAll();
	
	public Pokemon findByNombre(String nombre);
	
	public List<Pokemon> findByTipos(Tipo tipo);

}
