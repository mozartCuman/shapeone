package com.shapeone.shapeone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shapeone.shapeone.model.Treino;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {

	public List<Treino> findAllByNomeContainingIgnoreCase(@Param("nome") String treino);
}
