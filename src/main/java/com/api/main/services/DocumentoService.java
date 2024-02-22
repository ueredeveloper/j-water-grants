package com.api.main.services;

import java.util.List;

import com.api.main.models.DocumentoModel;
import com.api.main.repositories.DocumentoRepository;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class DocumentoService {
  final DocumentoRepository documentoRepository;

  public DocumentoService(DocumentoRepository documentoRepository) {
    this.documentoRepository = documentoRepository;
  }

  @Transactional
  public DocumentoModel save(DocumentoModel documento) {
    return documentoRepository.save(documento);
  }

  @Transactional
  public List<DocumentoModel> findAll() {
    return documentoRepository.findAll();
  }

  @Transactional
  public DocumentoModel findById(Long id) {
    return documentoRepository.findById(id).get();
  }

  @Transactional
  public void deleteById(Long id) {
    documentoRepository.deleteById(id);
  }

  @Transactional
  public void delete(DocumentoModel documento) {
    documentoRepository.delete(documento);
  }

  @Transactional
  public void deleteAll() {
    documentoRepository.deleteAll();
  }

}