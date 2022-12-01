package com.pokemon.pokedex.dao;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.pokedex.entity.Tipo;

public interface ITipoDao extends CrudRepository<Tipo, Integer>{
	
	public Tipo findByNombre(String nombre);

}
