package com.generation.lojadegames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Categoria;



public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public java.util.List<Categoria> findAllByDescricaoContainingIgnoreCase (@Param("descricao") String descricao);

}

