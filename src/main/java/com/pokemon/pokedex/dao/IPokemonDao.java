package com.pokemon.pokedex.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

public interface IPokemonDao extends CrudRepository<Pokemon, Integer>{
	
	public Pokemon findByNombre(String nombre);
	
	public List<Pokemon> findByTipos(Tipo tipo);

}
