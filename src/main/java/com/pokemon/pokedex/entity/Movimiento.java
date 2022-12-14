package com.pokemon.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movimiento")
@Data
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idMovimiento;

    String nombre;

    Integer potencia;

    @Column(name = "precision_mov")
    Integer precision;

    String descripcion;

    Integer pp;

    @OneToOne
    @JoinColumn(name = "id_tipo")
    Tipo tipo;

    Integer prioridad;
}
