package com.api.main.services;

import java.util.ArrayList;
import java.util.List;

import com.api.main.models.DocumentoModel;
import com.api.main.models.EnderecoModel;
import com.api.main.repositories.DocumentoRepository;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class DocumentoService {
  final DocumentoRepository documentoRepository;
  final EnderecoService enderecoService;

  public DocumentoService(DocumentoRepository documentoRepository, EnderecoService enderecoService) {
    this.documentoRepository = documentoRepository;
    this.enderecoService = enderecoService;
  }

  @Transactional
  public DocumentoModel save(DocumentoModel documento) {

      // Criar uma cópia do documento
      DocumentoModel savedDocumento = new DocumentoModel();
      savedDocumento.setNumero(documento.getNumero());
      savedDocumento.setSei(documento.getSei());
      savedDocumento.setTipo(documento.getTipo());
      savedDocumento.setProcesso(documento.getProcesso());
      savedDocumento.setEnderecos(documento.getEnderecos());

      savedDocumento = documentoRepository.save(savedDocumento);

      if (savedDocumento.getEnderecos() != null) {
          for (EnderecoModel endereco : savedDocumento.getEnderecos()) {
              // Inicialize a lista de documentos se for nula
              if (endereco.getDocumentos() == null) {
                  endereco.setDocumentos(new ArrayList<>());
              }
              DocumentoModel documentoEndereco = new DocumentoModel();
              documentoEndereco.setId(savedDocumento.getId());

              // Adicione o documento ao endereço
              endereco.getDocumentos().add(documentoEndereco);

              // Salve o endereço
              enderecoService.save(endereco);
          }
      }

      return savedDocumento;
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