package com.api.main.dto;

import java.util.List;

public class EnderecoDTO {

  private Long id;
  private String logradouro;
  private String cidade;
  private String cep;
  private List<DocumentoDTO> documentos;
  private List<UsuarioDTO> usuarios;

  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public List<DocumentoDTO> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<DocumentoDTO> documentos) {
    this.documentos = documentos;
  }

  public List<UsuarioDTO> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(List<UsuarioDTO> usuarios) {
    this.usuarios = usuarios;
  }

}