package com.api.main.dto;

import java.util.List;

public class DocumentoTipoDTO {

  private Long id;
  private String descricao;
  private List<DocumentoDTO> documentoMoedas;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public List<DocumentoDTO> getDocumentoMoedas() {
    return documentoMoedas;
  }

  public void setDocumentoMoedas(List<DocumentoDTO> documentoMoedas) {
    this.documentoMoedas = documentoMoedas;
  }

}