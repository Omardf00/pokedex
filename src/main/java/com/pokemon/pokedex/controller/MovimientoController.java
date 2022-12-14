package com.pokemon.pokedex.controller;

import com.pokemon.pokedex.entity.Movimiento;
import com.pokemon.pokedex.service.IMovimientoService;
import com.pokemon.pokedex.service.ITipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pokedex/movimiento")
public class MovimientoController {

    @Autowired
    IMovimientoService movimientoService;

    @Autowired
    ITipoService tipoService;

    @GetMapping("")
    public ResponseEntity<?> listMovimientos() {

        Map<String, Object> response = new HashMap<>();
        List<Movimiento> lista = new ArrayList<>();

        try {
            lista = movimientoService.findAll();
        } catch (DataAccessException e) {
            response.put("error", "We ran into a problem trying to access the database");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Error e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<List<Movimiento>>(lista, HttpStatus.OK);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<?> getMovimientoByNombre(@PathVariable("nombre") String nombreMovimiento) {
        Map<String, Object> response = new HashMap<>();
        Movimiento movimiento;

        try {
            movimiento = movimientoService.findByNombre(nombreMovimiento);
        } catch (DataAccessException e) {
            response.put("error", "We ran into a problem trying to access the database");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Error e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Movimiento>(movimiento, HttpStatus.OK);
    }

    @GetMapping("/pps/{pp}")
    public ResponseEntity<?> getMovimientoByPP(@PathVariable("pp") Integer pp) {
        Map<String, Object> response = new HashMap<>();
        List<Movimiento> movimientos;

        try {
            movimientos = movimientoService.findByPp(pp);
        } catch (DataAccessException e) {
            response.put("error", "We ran into a problem trying to access the database");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Error e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<List<Movimiento>>(movimientos, HttpStatus.OK);
    }

    @GetMapping("/potencia/{potencia}")
    public ResponseEntity<?> getMovimientoByPotencia(@PathVariable("potencia") Integer potencia) {
        Map<String, Object> response = new HashMap<>();
        List<Movimiento> movimientos;

        try {
            movimientos = movimientoService.findByPotencia(potencia);
        } catch (DataAccessException e) {
            response.put("error", "We ran into a problem trying to access the database");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Error e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<List<Movimiento>>(movimientos, HttpStatus.OK);
    }

    @GetMapping("/precision/{precision}")
    public ResponseEntity<?> getMovimientoByPrecision(@PathVariable("precision") Integer precision) {
        Map<String, Object> response = new HashMap<>();
        List<Movimiento> movimientos;

        try {
            movimientos = movimientoService.findByPrecision(precision);
        } catch (DataAccessException e) {
            response.put("error", "We ran into a problem trying to access the database");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Error e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<List<Movimiento>>(movimientos, HttpStatus.OK);
    }
}