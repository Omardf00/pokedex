package com.pokemon.pokedex.service;

import java.util.List;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

public interface IPokemonService {
	
	public List<Pokemon> findAll();
	
	public Pokemon findByNombre(String nombre);
	
	public List<Pokemon> findByTipos(Tipo tipo);

}
