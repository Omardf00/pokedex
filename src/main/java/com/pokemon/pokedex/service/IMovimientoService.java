package com.pokemon.pokedex.service;

import com.pokemon.pokedex.entity.Movimiento;

import java.util.List;

public interface IMovimientoService {

    public List<Movimiento> findAll();

    public Movimiento findByNombre(String nombreMovimiento);
}
