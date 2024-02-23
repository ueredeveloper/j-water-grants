package com.api.main.services;

import java.util.List;

import com.api.main.models.DocumentoModel;
import com.api.main.models.EnderecoModel;
import com.api.main.repositories.EnderecoRepository;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class EnderecoService {
  final EnderecoRepository enderecoRepository;

  public EnderecoService(EnderecoRepository enderecoRepository) {
    this.enderecoRepository = enderecoRepository;
  }

  @Transactional
  public EnderecoModel save(EnderecoModel endereco) {

    return enderecoRepository.save(endereco);
  }

  @Transactional
  public List<EnderecoModel> findAll() {
    return enderecoRepository.findAll();
  }

  @Transactional
  public EnderecoModel findById(Long id) {
    return enderecoRepository.findById(id).get();
  }

  @Transactional
  public void deleteById(Long id) {
    enderecoRepository.deleteById(id);
  }

  @Transactional
  public List<DocumentoModel> findAllDocumentosByEndereco(Long enderecoId) {
    EnderecoModel endereco = enderecoRepository.findById(enderecoId)
        .orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado com o ID: " + enderecoId));
    return endereco.getDocumentos();
  }
}