package com.pokemon.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_ataque")
@Data
public class TipoAtaque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_tipo;

    String tipo;
}
