package com.pokemon.pokedex.dao;

import com.pokemon.pokedex.entity.Movimiento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IMovimientoDao extends CrudRepository<Movimiento, Integer>{

    public Movimiento findByNombre(String nombreMovimiento);

    List<Movimiento> findByPp(Integer pp);

    List<Movimiento> findByPotencia(Integer potencia);
}
