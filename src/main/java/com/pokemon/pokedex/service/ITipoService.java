package com.pokemon.pokedex.service;

import com.pokemon.pokedex.entity.Tipo;

import java.util.List;

public interface ITipoService {
	
	public List<Tipo> findAll();
	
	public Tipo findByNombre(String nombre);

}
