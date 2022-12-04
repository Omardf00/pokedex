package com.pokemon.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tipo")
@Data
public class Tipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipo;
	
	private String nombre;

	@OneToOne
	@JoinColumn(name = "id_tipo_ataque")
	private TipoAtaque tipoAtaque;

}
