package com.api.main.services;

import java.util.List;

import com.api.main.models.UsuarioModel;
import com.api.main.repositories.UsuarioRepository;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class UsuarioService {
  final UsuarioRepository usuarioRepository;

  public UsuarioService(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
  }

  @Transactional
  public UsuarioModel save(UsuarioModel usuario) {
    return usuarioRepository.save(usuario);
  }

  @Transactional
  public List<UsuarioModel> findAll() {
    return usuarioRepository.findAll();
  }

  @Transactional
  public UsuarioModel findById(Long id) {
    return usuarioRepository.findById(id).get();
  }

  @Transactional
  public void deleteById(Long id) {
    usuarioRepository.deleteById(id);
  }
}