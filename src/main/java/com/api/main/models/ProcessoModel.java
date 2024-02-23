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
@Table(name = "processo")
public class ProcessoModel implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = true, unique = false, length = 40)
  private String numero;

  @JsonIgnore
  @OneToMany(mappedBy = "processo")
  private List<AnexoModel> anexos = new ArrayList<>();

  @JsonIgnore
  @OneToMany(mappedBy = "processo")
  private List<DocumentoModel> documentos = new ArrayList<>();

  public ProcessoModel() {
    super();
  }

  public ProcessoModel(String numero) {
    this.numero = numero;
  }

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
