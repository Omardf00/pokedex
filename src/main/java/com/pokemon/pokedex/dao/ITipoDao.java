package com.pokemon.pokedex.dao;

import com.pokemon.pokedex.entity.Tipo;
import org.springframework.data.repository.CrudRepository;

public interface ITipoDao extends CrudRepository<Tipo, Integer>{
	
	public Tipo findByNombre(String nombre);
	
	/*@Query(value = "select p.numero_pokedex, p.nombre, p.peso, p.altura "
			+ "from tipo t inner join pokemon_tipo pt "
			+ "on t.id_tipo = pt.id_tipo "
			+ "inner join pokemon p "
			+ "on p.numero_pokedex=pt.numero_pokedex "
			+ "where t.nombre = :nombre ",
			nativeQuery = true)
	public List<Pokemon> findByTipo(@Param("nombre") String nombre);*/

}
