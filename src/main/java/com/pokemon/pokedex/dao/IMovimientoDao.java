package com.pokemon.pokedex.dao;

import com.pokemon.pokedex.entity.Movimiento;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientoDao extends CrudRepository<Movimiento, Integer>{

    public Movimiento findByNombre(String nombreMovimiento);
}
