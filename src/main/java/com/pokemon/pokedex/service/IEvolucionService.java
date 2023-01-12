package com.pokemon.pokedex.service;

import com.pokemon.pokedex.entity.EvolucionaDe;

public interface IEvolucionService {
	
	public EvolucionaDe findEvolutionByIdPokemon(int idPokemon);

}
