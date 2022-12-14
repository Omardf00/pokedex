package com.pokemon.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="pokemon")
@Data
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroPokedex;
	
	private String nombre;
	
	private Double peso;
	
	private Double altura;
	
	@ManyToMany
	@JoinTable(
			name = "pokemon_tipo",
			joinColumns = @JoinColumn(name = "numero_pokedex", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "id_tipo", nullable = false)
	)
	List<Tipo> tipos;

}
