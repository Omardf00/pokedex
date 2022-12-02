package com.pokemon.pokedex.service;

import java.util.List;

import com.pokemon.pokedex.entity.Tipo;

public interface ITipoService {
	
	public List<Tipo> findAll();
	
	public Tipo findByNombre(String nombre);

}
