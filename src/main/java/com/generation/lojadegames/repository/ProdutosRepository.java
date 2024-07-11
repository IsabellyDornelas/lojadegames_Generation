package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllBytituloContainingIgnoreCase (@Param("titulo")String titulo);

}
