package com.shapeone.shapeone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shapeone.shapeone.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
