package com.pokemon.pokedex.responses;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;
import lombok.Data;

import java.util.List;

@Data
public class PokemonByTypeResponse {
	
	private Tipo tipo;
	
	private List<Pokemon> listaPokemon;

}
