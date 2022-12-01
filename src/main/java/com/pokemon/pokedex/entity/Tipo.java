package com.pokemon.pokedex.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tipo")
@Data
public class Tipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipo;
	
	private String nombre;
	
	private int idTipoAtaque;
	
	@ManyToMany(mappedBy = "idTipo")
	Set<Pokemon> numeroPokedex;

}
