package com.pokemon.pokedex.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "evoluciona_de")
@Data
public class EvolucionaDe {
	
	@Id
	int pokemonOrigen;
	
	@OneToMany
	@JoinColumn(name = "pokemon_evolucionado")
	List<Pokemon> pokemonEvolucionado;

}
