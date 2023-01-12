package com.pokemon.pokedex.service;

import com.pokemon.pokedex.entity.EvolucionaDe;
import com.pokemon.pokedex.entity.Pokemon;

public interface IEvolucionService {
	
	public EvolucionaDe findEvolutionByIdPokemon(Pokemon pokemon);

}
