package com.pokemon.pokedex.controller;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;
import com.pokemon.pokedex.responses.PokemonByTypeResponse;
import com.pokemon.pokedex.service.IPokemonService;
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
@RequestMapping("/api/v1/pokedex/pokemon")
public class PokemonController {

	@Autowired
	IPokemonService pokemonService;

	@Autowired
	ITipoService tipoService;

	@GetMapping("")
	public ResponseEntity<?> listPokemons() {

		Map<String, Object> response = new HashMap<>();
		List<Pokemon> lista = new ArrayList<>();

		try {
			lista = pokemonService.findAll();
		} catch (DataAccessException e) {
			response.put("error", "We ran into a problem trying to access the database");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Error e) {
			response.put("error", "The service is not available");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<List<Pokemon>>(lista, HttpStatus.OK);
	}

	@GetMapping("/{nombre}")
	public ResponseEntity<?> pokemonByName(@PathVariable("nombre") String nombre) {

		Map<String, Object> response = new HashMap<>();
		Pokemon pokemon = null;

		try {
			pokemon = pokemonService.findByNombre(nombre);

			if (pokemon == null) {
				response.put("message", "The pokemon " + nombre + " does not exist in our data base");
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
			}
		} catch (DataAccessException e) {
			response.put("error", "We ran into a problem trying to access the database");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Error e) {
			response.put("error", "The service is not available");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Pokemon>(pokemon, HttpStatus.OK);
	}

	@GetMapping("/pokemonByType/{nombre}")
	public ResponseEntity<?> getPokemonsByType(@PathVariable("nombre") String nombre) {

		Map<String, Object> response = new HashMap<>();
		Tipo tipo = new Tipo();
		List<Pokemon> listaPokemon = new ArrayList<>();
		PokemonByTypeResponse responsePokemon = new PokemonByTypeResponse();

		try {

			tipo = tipoService.findByNombre(nombre);

			if (tipo == null) {
				response.put("message", "No existe el tipo: " + nombre);
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
			}

			listaPokemon = pokemonService.findByTipos(tipo);

			responsePokemon.setTipo(tipo);
			responsePokemon.setListaPokemon(listaPokemon);

		} catch (DataAccessException e) {
			response.put("error", "We ran into a problem trying to access the database");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Error e) {
			response.put("error", "The service is not available");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<PokemonByTypeResponse>(responsePokemon, HttpStatus.OK);
	}
}
