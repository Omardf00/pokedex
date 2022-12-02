package com.pokemon.pokedex.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

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
