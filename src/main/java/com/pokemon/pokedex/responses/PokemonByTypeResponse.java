package com.pokemon.pokedex.responses;

import java.util.List;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

import lombok.Data;

@Data
public class PokemonByTypeResponse {
	
	private Tipo tipo;
	
	private List<Pokemon> listaPokemon;

}
