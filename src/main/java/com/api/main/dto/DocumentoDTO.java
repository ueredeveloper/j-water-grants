package com.api.main.dto;

import java.util.List;

import com.api.main.models.DocumentoTipoModel;
import com.api.main.models.EnderecoModel;
import com.api.main.models.ProcessoModel;

public class DocumentoDTO {

  private Long id;
  private String numero;
  private String sei;
  private DocumentoTipoModel tipo;
  private ProcessoModel processo;
  private List<EnderecoModel> enderecos;

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

  public String getSei() {
    return sei;
  }

  public void setSei(String sei) {
    this.sei = sei;
  }

  public DocumentoTipoModel getTipo() {
    return tipo;
  }

  public void setTipo(DocumentoTipoModel tipo) {
    this.tipo = tipo;
  }

  public ProcessoModel getProcesso() {
    return processo;
  }

  public void setProcesso(ProcessoModel processo) {
    this.processo = processo;
  }

  public List<EnderecoModel> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<EnderecoModel> enderecos) {
    this.enderecos = enderecos;
  }

}