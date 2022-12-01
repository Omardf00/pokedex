package com.pokemon.pokedex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.pokemon.pokedex.entity.Pokemon;
import com.pokemon.pokedex.entity.Tipo;

public interface ITipoDao extends CrudRepository<Tipo, Integer>{
	
	public Tipo findByNombre(String nombre);
	
	@Query(value = "select p.* "
			+ "from tipo t inner join pokemon_tipo pt "
			+ "on t.id_tipo = pt.id_tipo "
			+ "inner join pokemon p "
			+ "on p.numero_pokedex=pt.numero_pokedex "
			+ "where t.nombre = :nombre ",
			nativeQuery = true)
	public List<Pokemon> findByTipo(@Param("nombre") String nombre);

}
