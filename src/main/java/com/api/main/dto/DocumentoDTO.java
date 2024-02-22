package com.api.main.dto;

import java.util.List;

public class DocumentoDTO {
  
  Long id;
  String numero;
  String processo;
  String sei;
  DocumentoTipoDTO tipo;
  List<EnderecoDTO> enderecos;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getProcesso() {
    return processo;
  }

  public void setProcesso(String processo) {
    this.processo = processo;
  }

  public String getSei() {
    return sei;
  }

  public void setSei(String sei) {
    this.sei = sei;
  }

  public DocumentoTipoDTO getTipo() {
    return tipo;
  }

  public void setTipo(DocumentoTipoDTO tipo) {
    this.tipo = tipo;
  }

  public List<EnderecoDTO> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<EnderecoDTO> enderecos) {
    this.enderecos = enderecos;
  }

}