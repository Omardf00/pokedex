package com.pokemon.pokedex.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokedex.entity.EvolucionaDe;
import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.service.IEvolucionService;
import com.pokemon.pokedex.service.IPokemonService;

@RestController
@RequestMapping("/api/v1/pokedex/evolucion")
public class EvolucionController {
	
	@Autowired
	IEvolucionService evolucioService;
	
	@Autowired
	IPokemonService pokemonService;
	
	@GetMapping("/{nombrePokemon}")
	public ResponseEntity<?> findEvolution(@PathVariable("nombrePokemon") String nombrePokemon){
		
		Map<String, Object> response = new HashMap<>();
		Pokemon pokemon = new Pokemon();
		EvolucionaDe evolucionaDe = new EvolucionaDe();
		
		try {
			
			pokemon = pokemonService.findByNombre(nombrePokemon);
			
			if (pokemon == null) {
				response.put("message", "No existe el pokemon llamado " + nombrePokemon);
				return new ResponseEntity<Map<String, Object>>(response,HttpStatus.BAD_REQUEST);
			}
			
			evolucionaDe = evolucioService.findEvolutionByIdPokemon(pokemon.getNumeroPokedex());
			
		} catch (DataAccessException e) {
			response.put("error", "We ran into a problem trying to access the database");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Error e) {
			response.put("error", "The service is not available");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<EvolucionaDe>(evolucionaDe, HttpStatus.OK);
		
	}

}
