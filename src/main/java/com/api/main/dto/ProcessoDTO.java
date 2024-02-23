package com.api.main.dto;

import java.util.ArrayList;
import java.util.List;

import com.api.main.models.AnexoModel;
import com.api.main.models.DocumentoModel;

public class ProcessoDTO {

  private Long id;
  private String numero;
  private List<AnexoModel> anexos = new ArrayList<>();
  private List<DocumentoModel> documentos = new ArrayList<>();

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

  public List<AnexoModel> getAnexos() {
    return anexos;
  }

  public void setAnexos(List<AnexoModel> anexos) {
    this.anexos = anexos;
  }

  public List<DocumentoModel> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<DocumentoModel> documentos) {
    this.documentos = documentos;
  }

}