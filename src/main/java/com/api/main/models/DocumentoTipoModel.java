package com.api.main.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "documento_tipo")
public class DocumentoTipoModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = true, unique = false, length = 40)
  private String descricao;

  @JsonIgnore
  @OneToMany(mappedBy = "tipo")
  private List<DocumentoModel> documentos = new ArrayList<DocumentoModel>();

  // constructors
  public DocumentoTipoModel() {
    super();
  }

  
  public DocumentoTipoModel(String descricao) {
    this.descricao = descricao;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

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

  public List<DocumentoModel> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<DocumentoModel> documentos) {
    this.documentos = documentos;
  }

}