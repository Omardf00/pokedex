package com.pokemon.pokedex.service;

import com.pokemon.pokedex.dao.IMovimientoDao;
import com.pokemon.pokedex.dao.IPokemonDao;
import com.pokemon.pokedex.entity.Movimiento;
import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovimientoServiceImpl implements IMovimientoService{
	
	@Autowired
	IMovimientoDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Movimiento> findAll() {
		return (List<Movimiento>) dao.findAll();
	}

	@Override
	public Movimiento findByNombre(String nombreMovimiento) {
		return dao.findByNombre(nombreMovimiento);
	}

}
