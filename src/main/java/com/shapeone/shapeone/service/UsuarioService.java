package com.shapeone.shapeone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shapeone.shapeone.model.Usuario;
import com.shapeone.shapeone.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
    @Autowired
    private UsuarioRepository usuarioRepository;

    public String calculoIMC(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        double imc = usuario.getPeso() / Math.pow(usuario.getAltura(), 2);
        return "O IMC do " + usuario.getNome() + " é " + Math.round(imc * 100.0) / 100.0;
    }

	
}
