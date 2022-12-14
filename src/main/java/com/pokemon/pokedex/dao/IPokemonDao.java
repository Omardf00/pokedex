package com.pokemon.pokedex.dao;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPokemonDao extends CrudRepository<Pokemon, Integer>{
	
	public Pokemon findByNombre(String nombre);
	
	public List<Pokemon> findByTipos(Tipo tipo);

}
